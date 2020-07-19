import simple.sample

def call()
{

pipeline {
        agent any
        
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
                         def simple1=new sample(this)
                             simple1.logMeIn()
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

