def sayHello(Map args) {
    def params = [message: 'aa', message2: 'bb'] + (args ?: [:])
    echo "helo ${params.message}, ${params.message2}"
}