void call() {

  echo "===== DEPLOYMENT SUMMARY ====="

  state.results.each { key, value ->
    echo "${key} → ${value}"
  }
}