def call(){
environment {
 def BUILDVERSION = sh(script: "echo `date +%s`", returnStdout: true).trim()
}
def env = System.getenv()
println(env['JENKINS_HOME'])
println(env[BUILD_ID])
 
           println(BUILDVERSION)
    
}
