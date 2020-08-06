def call()
{
pipeline {
        agent {label 'EC2StaticJenkinsSlaveFinal'}
        
        stages {
            stage("env"){
                steps {
                    script {
                        echo "env setup"
                    }
                }
            }
            stage('login') {
                steps {
                    script {
                         echo "login"
                           }
                }
            }
            stage ('build and push image') {
                steps {
                    script {
                        echo "env build "
                    }
                }
            }
        } //stages
        
    }
}

