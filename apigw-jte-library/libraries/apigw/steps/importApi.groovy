void call(String gw) {

  sh """
    source common.lib
    import_api "${env.API_PROJECT}" "${gw}" "${env.APIGW_CREDS_USR}" "${env.APIGW_CREDS_PSW}"
  """
}