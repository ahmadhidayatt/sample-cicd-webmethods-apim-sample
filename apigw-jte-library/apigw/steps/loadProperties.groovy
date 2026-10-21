void call() {
  env.REPO_URL       = config.repoUrl
  env.REPO_BRANCH    = config.repoBranch
  env.REPO_CRED_ID   = config.repoCredId
  env.API_PROJECT    = config.apiProject
  env.APIGATEWAY_URLS    = (config.gatewayUrls ?: []).join(",")
  env.APIGATEWAY_ES_URLS = (config.esUrls ?: []).join(",")
}
