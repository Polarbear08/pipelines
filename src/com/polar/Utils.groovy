package com.polar

class Utils implements Serializable {
    
    def sayHello(String message) {
        sh "echo hello, ${message}"
    }
}