import com.polar.Utils

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
                    sh 'echo hello world'
                    sh """
                        echo ${this.class.name}
                    """
                    script {
                        utilities.sayHello message2: 'bbc'
                    }
                }
            }
        }
    }
}

// def sayHello(String message = 'hello') {
//     echo "hello ${message}"
// }