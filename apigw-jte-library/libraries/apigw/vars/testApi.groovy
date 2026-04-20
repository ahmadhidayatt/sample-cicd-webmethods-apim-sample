void call(String gw, String esUrl) {

  sh """
    rm -rf test-results
    mkdir -p test-results

    docker run --rm \
      -v \$PWD:/etc/newman \
      -w /etc/newman \
      postman/newman:latest \
      run tests/collection.json \
      -e tests/environment.json \
      --env-var username=${env.APIGW_CREDS_USR} \
      --env-var password=${env.APIGW_CREDS_PSW} \
      --env-var httpInvokeUrl=${gw} \
      --env-var esUrl=${esUrl} \
      --reporters cli,junit \
      --reporter-junit-export test-results/result.xml
  """
}