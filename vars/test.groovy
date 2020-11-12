def call(Closure body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

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
}