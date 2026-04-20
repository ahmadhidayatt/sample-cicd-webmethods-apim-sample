void call() {
  sh 'pwd'
  sh 'ls -la'
  sh 'ls -R'

 
  echo libraryResource('common.lib')

  def commonLib = libraryResource('bin/common.lib')
  if (!commonLib) {
    error 'common.lib not found in Shared Library resources/bin/'
  }
  echo 'Preparing shell scripts from JTE library...'

  writeFile file: 'common.lib',
    text: libraryResource('bin/common.lib')
}
