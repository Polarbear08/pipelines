def call(Closure body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

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
                    script {
                        utils.sayHello message2: 'bbc'
                        utils.sayYeah
                        utils.sayYeah yeah: 'green'
                    }
                }
            }
        }
    }
}

// def sayHello(String message = 'hello') {
//     echo "hello ${message}"
// }