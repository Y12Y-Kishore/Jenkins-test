pipeline {
  agent any
  stages {
    stage('A') {
      parallel {
        stage('A') {
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
            sh 'echo "hello"'
          }
        }

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