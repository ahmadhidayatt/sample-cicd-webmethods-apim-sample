libraries {
  apigw {
    apiProject = 'Training00'
    repoUrl     = 'https://github.com/ahmadhidayatt/sample-cicd-webmethods-apim-sample.git'
    repoCredId  = 'github'
    repoBranch  = 'main'
    gatewayUrl = 'http://84.247.147.48:9072'

    gatewayUrls = [
      'http://84.247.147.48:9072'
    ]

    esUrls = [
      'http://84.247.147.48:9240'
    ]

    credentialsId = 'apigw-admin'
  }
}
