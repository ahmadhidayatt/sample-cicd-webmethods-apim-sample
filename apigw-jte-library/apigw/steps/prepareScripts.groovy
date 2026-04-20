void call() {
  sh 'pwd'
  sh 'ls -R'
  echo 'DEBUG LIBRARY RESOURCE'
  sh 'ls -R $JENKINS_HOME/workspace/@libs || true'
  String  commonLib = resource('common.lib')

  echo 'Preparing shell scripts from JTE library...'

  writeFile file: 'common.lib', text: commonLib
}
