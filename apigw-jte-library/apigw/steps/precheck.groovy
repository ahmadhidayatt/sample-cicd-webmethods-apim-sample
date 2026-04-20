void call(String gw) {

  sh """
    chmod +x common.sh
    ./common.sh validate_gateway_up "${gw}" "${env.APIGW_CREDS_USR}" "${env.APIGW_CREDS_PSW}"
  """
}