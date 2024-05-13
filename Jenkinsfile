pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                sh 'make build' // Dieser Befehl führt das Ziel 'build' in Ihrer Makefile aus
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                sh 'make test' // Dieser Befehl führt das Ziel 'test' in Ihrer Makefile aus
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                sh 'make deploy' // Dieser Befehl führt das Ziel 'deploy' in Ihrer Makefile aus
            }
        }
    }
}
