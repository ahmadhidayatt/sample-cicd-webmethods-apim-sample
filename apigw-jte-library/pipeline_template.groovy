pipeline {
  agent any

  options {
    timestamps()
    timeout(time: 90, unit: 'MINUTES')
  }

  stages {

    stage('Init') {
      steps {
        loadProperties()
      }
    }

    stage('Deploy') {
      steps {
        deploy()
      }
    }

    stage('Summary') {
      steps {
        summary()
      }
    }
  }
}