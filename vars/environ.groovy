def call(){
def env = System.getenv()
println(env['JENKINS_HOME'])
println(env[BUILD_ID])
  environment {
        def BUILDVERSION = sh(script: "echo `date +%s`", returnStdout: true).trim()
           println(BUILDVERSION)
    }
}
