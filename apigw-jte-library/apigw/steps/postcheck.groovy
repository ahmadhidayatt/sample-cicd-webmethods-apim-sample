void call(String gw) {

  sh """
    chmod +x common.sh
    ./common.sh validate_api_exists "${env.API_PROJECT}" "${gw}" "${env.APIGW_CREDS_USR}" "${env.APIGW_CREDS_PSW}"
    ./common.sh validate_application "${env.API_PROJECT}" "${gw}" "${env.APIGW_CREDS_USR}" "${env.APIGW_CREDS_PSW}"
  """
}