void call() {

  String  commonLib = resource('gateway_lib.sh')

  echo 'Preparing shell scripts from JTE library...'

  writeFile file: 'common.lib', text: commonLib

  sh 'pwd'
  sh 'ls -R'

  echo 'DEBUG LIBRARY RESOURCE'
  sh 'ls -R $JENKINS_HOME/workspace/@libs || true'
}
