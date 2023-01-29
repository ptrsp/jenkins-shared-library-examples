def call(name) {
    script {
        sh """
            echo Hi ${name}
        """
    }
}
