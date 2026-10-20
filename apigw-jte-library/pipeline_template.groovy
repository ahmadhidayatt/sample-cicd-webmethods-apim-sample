node {
  loadProperties()
  checkout([
    $class: 'GitSCM',
    branches: [[name: "*/${env.REPO_BRANCH}"]],
    userRemoteConfigs: [[
      url: env.REPO_URL
    ]]
  ])
  deploy()
  summary()
}
