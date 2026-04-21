libraries {
  apigw {
    apiProject = 'apiMsCustomer'
    repoUrl     = 'https://github.com/ahmadhidayatt/asset-api-testcicd-v2.git'
    repoCredId  = 'gitpwd'
    repoBranch  = 'main'
    gatewayUrl = 'http://100.87.70.99:25155'

    gatewayUrls = [
    'http://100.87.70.99:25155',
    'http://100.87.70.99:45155',
    'http://100.88.89.10:25155',
    'http://100.119.82.110:5555'
  ]

    esUrls = [
    'http://100.87.70.99:29240',
    'http://100.87.70.99:49240',
    'http://100.88.89.10:29240',
    'http://100.119.82.110:9240'
  ]

    username = 'Administrator'
    password = 'manage'
    credentialsId = 'apigw-creds'
  }
}
