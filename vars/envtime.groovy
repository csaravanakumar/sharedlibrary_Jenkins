import java.util.Date;
def call(){
pipeline {
    environment {
         def now = new Date()
        println now.format("yyMMdd.HHmm", TimeZone.getTimeZone('UTC'))
        SOME_NAME = "dev1"
       }
   agent {label 'EC2StaticJenkinsSlaveFinal'}

    stages {
        stage("Env Variables") {
            steps {
                echo "The build number is ${env.BUILD_NUMBER}->${now}"
                echo "You can also use \${now} -> ${now}->${SOME_NAME}"
                sh 'echo "I can access $BUILD_NUMBER in shell command as well."'
            }
        }
    }
}
}
