pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Build'
            }
        }
        stage('Test'){
            steps {
                echo 'Test'
            }
        }
        stage('Success'){
            steps {
                echo 'Success'
            }
        }
    }
}