package com.polar

class Utils implements Serializable {
    def steps

    Utils(steps) {
        this.steps = steps
        println this.steps
    }
    
    def sayHello(String message) {
        this.steps.sh "echo hello, ${message}"
    }
}