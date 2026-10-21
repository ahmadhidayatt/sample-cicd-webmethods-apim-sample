libraries {
  apigw {
    apiProject = 'Training00'
    repoUrl     = 'https://github.com/ahmadhidayatt/sample-cicd-webmethods-apim-sample.git'
    repoCredId  = ''
    repoBranch  = 'main'
    gatewayUrl = 'http://84.247.147.48:5555'

    gatewayUrls = [
      'http://84.247.147.48:5555'
    ]

    esUrls = [
      'http://84.247.147.12:9200'
    ]

    credentialsId = 'apigwcredential'
  }
}
