void call(String gw, String user, String pass) {

  sh """
    chmod +x common.sh
    ./common.sh validate_gateway_up "${gw}" "${user}" "${pass}"
  """
}