pipeline {
    agent any

    environment {
        APP_ENV = 'production'
    }

    options {
        timeout(time: 1, unit: 'HOURS')
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                sh 'make build' // Example build command
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                sh 'make test' // Example test command
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                sh 'make deploy' // Example deploy command
            }
        }
    }

    post {
        always {
            echo 'This will always run'
        }
        success {
            echo 'This will run only if the pipeline succeeded'
        }
        failure {
            echo 'This will run only if the pipeline failed'
        }
    }
}
