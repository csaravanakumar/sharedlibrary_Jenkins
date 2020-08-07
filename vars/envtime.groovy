def call(){
pipeline {
    environment {
        Date date = new Date()
        String datePart = date.format("dd/MM/yyyy")
        String timePart = date.format("HH:mm:ss")
    SOME_NAME = "dev1"
       }
   agent {label 'EC2StaticJenkinsSlaveFinal'}

    stages {
        stage("Env Variables") {
            steps {
                echo "The build number is ${env.BUILD_NUMBER}->${datePart}"
                echo "You can also use \${datePart} -> ${timePart}->${SOME_NAME}"
                sh 'echo "I can access $BUILD_NUMBER in shell command as well."'
            }
        }
    }
}
}
