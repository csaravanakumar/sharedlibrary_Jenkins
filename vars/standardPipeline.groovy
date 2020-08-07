#!/usr/bin/env groovy
import Deploy1
def call(body) {
    echo "Start Deploy"

  new Deploy1().run()

    echo "Deployed"
    currentBuild.result = 'SUCCESS' //FAILURE to fail

    return this
}
