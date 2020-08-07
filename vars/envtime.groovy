import java.util.Date;
def call(){
pipeline {
    environment {
         SOME_NAME = "dev1"
         REPO_NAME = "sample"
       }
   agent {label 'EC2StaticJenkinsSlaveFinal'}

    stages {
        stage("Env Variables") {
            steps {
                echo "The build number is ${env.BUILD_NUMBER}"
                echo "You can also use \${now} -> ${REPO_NAME}->${SOME_NAME}"
                sh 'echo "I can access $BUILD_NUMBER in shell command as well."'
            }
        }
    }
}
}
