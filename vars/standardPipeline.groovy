import Deploy
def call(body) {
      def deploy = new Deploy(this)
      deploy.readConfig()
   }
