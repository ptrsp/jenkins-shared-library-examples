def call(name="SAKANA") {
    script {
        sh """
            echo Hi ${name}
        """
    }
}
