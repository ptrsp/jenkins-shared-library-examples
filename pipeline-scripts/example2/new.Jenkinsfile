@Library('slibrary-example@main') _
pipeline {
    agent {
        node {
            label ""
        }
    }
    stages {
        stage("Hello World") {
            steps {
                script {
                   example2()
                }
            }
        }
    }
}
