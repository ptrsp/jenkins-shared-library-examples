def call(String saywhat = "nothing") {
    if (saywhat == "hi") {
        script {
            sh """
                echo Hi Alice
            """
        }
    } else if (saywhat == "hello") {
        script {
            sh """
                echo Hello Alice
            """
        }
    } else if (saywhat == "nothing") {
        script {
            sh """
                echo Hello Nothing
            """
        }
    } else {
        script {
            sh """
                echo Whats up Alice
            """
        }
    }
}

