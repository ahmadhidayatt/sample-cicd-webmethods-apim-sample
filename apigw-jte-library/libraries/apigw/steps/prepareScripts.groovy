void call() {

  echo "Preparing shell scripts from JTE library..."

  writeFile file: 'common.lib',
    text: libraryResource('bin/common.lib')

  writeFile file: 'gateway_utils.sh',
    text: libraryResource('bin/gateway_import_export_utils.sh')

  writeFile file: 'gateway_setup.sh',
    text: libraryResource('bin/gateway_setup.sh')

  sh """
    chmod +x *.sh
  """
}