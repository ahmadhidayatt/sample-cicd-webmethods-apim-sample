void call() {
  sh 'ls -R'
 
  echo "Preparing shell scripts from JTE library..."

  writeFile file: 'common.lib',
    text: libraryResource('resources/bin/common.lib')

  writeFile file: 'gateway_utils.sh',
    text: libraryResource('resources/bin/gateway_import_export_utils.sh')

  writeFile file: 'gateway_setup.sh',
    text: libraryResource('resources/bin/gateway_setup.sh')

  sh """
    chmod +x *.sh
  """
}