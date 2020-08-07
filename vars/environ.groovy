def call(){
def env = System.getenv()
println(env['JENKINS_HOME'])
println(env.BUILD_ID)
}
