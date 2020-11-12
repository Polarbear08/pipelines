pipiline {
    agent {
        label 'master'
    }
    options {
        timestamps()
    }
    stages {
        stage('test') {
            sh 'echo hello world'
        }
    }
}
