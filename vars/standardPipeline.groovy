import Deploy
def call() {
      def deploy = new Deploy(this)
      deploy.readConfig()
   }
