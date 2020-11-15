def sayHello(Map args) {
    def params = [message: 'aa', message2: 'bb'] + (args ?: [:])
    echo "helo ${params.message}, ${params.message2}"
}

def sayYeah(Map args) {
    def params = [yeah: 'Yeah!'] + (args ?: [:])
    sh """
        echo ${params.yeah}
    """
}