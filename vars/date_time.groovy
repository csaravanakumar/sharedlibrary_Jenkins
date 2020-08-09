import java.time.*
def call(body) {
    def now = LocalDateTime.now()
     println now
     echo "The build number is ${env.BUILD_NUMBER}"
    }
