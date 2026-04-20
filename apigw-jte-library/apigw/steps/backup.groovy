void call(String gw) {
  def result = sh(
    script: """
    chmod +x common.sh
    ./common.sh backup_api "${env.API_PROJECT}" "${gw}" "${env.APIGW_CREDS_USR}" "${env.APIGW_CREDS_PSW}"
    """,
    returnStdout: true
  ).trim()

  def parts = result.split('\\|')

  env.BACKUP_FILE = parts[0]
  env.APP_FILE    = parts.size() > 1 ? parts[1] : ''

  echo "Backup file: ${env.BACKUP_FILE}"
  echo "App file: ${env.APP_FILE}"

  return env.BACKUP_FILE
}
