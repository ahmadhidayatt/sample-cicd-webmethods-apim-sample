void call(String gw) {
  sh """
    chmod +x common.sh
    ./common.sh rollback_api "${env.BACKUP_FILE}" "${gw}" "${env.APIGW_CREDS_USR}" "${env.APIGW_CREDS_PSW}"
  """
}
