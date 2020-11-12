import com.polar.Utils

def call(Closure body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    def utils = new Utils()

    pipeline {
        agent {
            label 'master'
        }
        options {
            timestamps()
        }
        stages {
            stage('test') {
                steps {
                    sh 'echo hello world'
                    utils.sayHello()
                }
            }
        }
    }
}