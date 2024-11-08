pipeline {
    agent any
    stages {
        stage ("block-1") {
            steps {
                echo "block-1"
                echo "$NAME"
            }
        }
    }
}
