void call() {

  def props = readProperties file: 'jenkins/jenkins.properties'

  env.API_PROJECT        = props['api_project']
  env.APIGATEWAY_URLS    = props['apigateway_urls']
  env.APIGATEWAY_ES_URLS = props['apigateway_es_urls']
}