void call(String gw) {
  sh """
    chmod +x common.sh
    ./common.sh import_api "${env.API_PROJECT}" "${gw}" "${env.APIGW_CREDS_USR}" "${env.APIGW_CREDS_PSW}"
  """
}
