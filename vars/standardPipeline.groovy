#!/usr/bin/env groovy

def call(body) {
    echo "Start Deploy"

   def d1=new Deploy1()
    d1.run()

    echo "Deployed"
    currentBuild.result = 'SUCCESS' //FAILURE to fail

    return this
}
