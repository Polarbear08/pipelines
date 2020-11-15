package com.polar

class Utils implements Serializable {
    def steps

    Utils(steps) {
        this.steps = steps
    }
    
    def sayHello(String message) {
        this.steps.sh "this.steps: ${this.steps}"
        this.steps.sh "this.steps.sh: ${this.steps.sh}"
        this.steps.sh "echo hello, ${message}"
    }
}