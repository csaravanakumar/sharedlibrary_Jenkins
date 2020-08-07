package csk1.csk2.csk3;

import static Constants.GITHUB_CREDENTIALS_ID;

def checkout(String repo, 
    String branch = "master"){
    stage("Checkout"){
        checkout([
            $class: 'GitSCM', 
            branches: [[name: "${branch}"]], 
            doGenerateSubmoduleConfigurations: false, 
            userRemoteConfigs: [[
                credentialsId: "${GITHUB_CREDENTIALS_ID}", 
                url: "${repo}"
            ]]
        ])
    }
}