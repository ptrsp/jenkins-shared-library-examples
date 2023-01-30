def call(Closure postHelloScript) {
    node {
        postHelloScript()
        stage("Hello World") {
            script {
                sh """
                    echo Hello
                """
            }
        }
        
    }
}

