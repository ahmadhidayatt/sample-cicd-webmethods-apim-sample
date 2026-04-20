void call(String gw) {

  sh """
    chmod +x common.sh
    ./common.sh validate_gateway_up "${gw}" "${user}" "${pass}"
  """
}