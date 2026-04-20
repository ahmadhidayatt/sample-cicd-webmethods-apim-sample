@Validate
void call() {
  prepareScripts()
  def cfg = config.libraries.apigw
  def gateways   = cfg.gatewayUrls
  def esList     = cfg.esUrls
  def user       = cfg.username
  def pass       = cfg.password
  def apiProject = cfg.apiProject

  def results  = [:]

  for (int i = 0; i < gateways.size(); i++) {
    def gw = gateways[i].trim()
    def esUrl = esList[i].trim()

    stage("GW-${i+1} (${gw})") {
      try {
        precheck(gw)
        def backupFile = backup(gw)
        importApi(gw)
        postcheck(gw)
        testApi(gw, esUrl)

        results[gw] = 'SUCCESS'
      } catch (err) {
        echo "FAILED on ${gw}"
        results[gw] = 'FAILED'

        rollback(gw)

        error("STOP DEPLOY — failure on ${gw}")
      }
    }
  }

  state.results = results
}
