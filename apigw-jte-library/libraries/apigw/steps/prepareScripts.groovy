void call() {
  sh 'pwd'
  sh 'ls -la'
  sh 'ls -R'

  echo 'Preparing shell scripts from JTE library...'

  writeFile file: 'common.lib',
    text: libraryResource('bin/common.lib')

  writeFile file: 'gateway_utils.sh',
    text: libraryResource('bin/gateway_import_export_utils.sh')

  sh '''
    chmod +x *.sh
  '''
}
