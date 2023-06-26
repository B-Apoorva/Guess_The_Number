pipeline{
agent any
stages{
    stage("Git checkout"){
        steps{
            git credentialsId: 'ec55d561-ea20-4331-bb19-1cf39707e292', url: 'https://github.com/B-Apoorva/Guess_The_Number.git'
        }
    }
    stage("Maven Build"){
        steps{
        sh "mvn clean package"
        sh "mv target/*.jar target/game.jar"
        }
    }
    stage("Deploy"){
        steps{
            sshagent(['deploy_user']) {
             sh "scp -o StrictHostKeyChecking=no /var/lib/jenkins/workspace/Guessing_game/target/game.jar ec2-user@13.234.112.197:/opt/tomcat/webapps"
}
        }
    }
    }
}
