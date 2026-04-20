void call(String gw) {

  sh """
    source common.lib
    rollback_api "${env.BACKUP_FILE}" "${gw}" "${env.APIGW_CREDS_USR}" "${env.APIGW_CREDS_PSW}"
  """
}