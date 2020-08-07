#!/usr/bin/env groovy

def call(body) {
    echo "Start Deploy"

  new Deploy1().run()

    echo "Deployed"
    currentBuild.result = 'SUCCESS' //FAILURE to fail

    return this
}
