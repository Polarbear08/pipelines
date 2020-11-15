package com.polar

class Utils implements Serializable {
    def steps

    Utils(steps) {
        this.steps = steps
    }
    
    def sayHello(String message) {
        def printThis = this
        this.steps.sh "this: ${printThis.class.name}"
        this.steps.sh "this.steps: ${this.steps.class.name}"
        this.steps.sh "this.steps.sh: ${this.steps.sh.class.name}"
        this.steps.sh "echo hello, ${message}"
    }
}