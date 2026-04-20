void call() {
  prepareScripts()
  def gateways = config.libraries.apigw.gatewayUrls.split(',')
  def esList   = config.libraries.apigw.esUrls.split(',')
  def user     = config.libraries.apigw.apigw.username
  def pass     = config.libraries.apigw.apigw.password
  def apiName  = config.libraries.apigw.apiProject
  
  def apiProject = config.libraries.apigw.apiProject
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
