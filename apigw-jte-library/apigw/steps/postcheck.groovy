void call(String gw) {

  sh """
    source common.lib
    validate_api_exists "${env.API_PROJECT}" "${gw}" "${env.APIGW_CREDS_USR}" "${env.APIGW_CREDS_PSW}"
    validate_application "${env.API_PROJECT}" "${gw}" "${env.APIGW_CREDS_USR}" "${env.APIGW_CREDS_PSW}"
  """
}