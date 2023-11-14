pipeline {
  agent any
  stages {
    stage('A') {
      environment {
        name = 'kishore'
      }
      post {
        always {
          echo '========always========'
        }

        success {
          echo '========A executed successfully========'
        }

        failure {
          echo '========A execution failed========'
        }

      }
      steps {
        echo 'hello'
      }
    }

    stage('') {
      steps {
        echo 'hello'
      }
    }

  }
  post {
    always {
      echo '========always========'
    }

    success {
      echo '========pipeline executed successfully ========'
    }

    failure {
      echo '========pipeline execution failed========'
    }

  }
}