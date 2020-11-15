import com.polar.Utils

def call(Closure body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    def utilities = new Utils(this)

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
                        sh 'echo hello world'
                        sh """
                            echo ${this.class.name}
                        """
                        utilities.sayHello('a')
                    }
                }
            }
        }
    }
}

// def sayHello(String message = 'hello') {
//     echo "hello ${message}"
// }