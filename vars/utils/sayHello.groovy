def call(String message = 'hello') {
    node {
        echo "helo ${message}"
    }
}