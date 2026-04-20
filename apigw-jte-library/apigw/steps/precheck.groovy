void call(String gw) {

  sh """
    source common.lib
    validate_gateway_up "${gw}" "${env.APIGW_CREDS_USR}" "${env.APIGW_CREDS_PSW}"
  """
}