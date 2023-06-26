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
        sh "mvn compile"
        sh "mvn test"
        sh "mvn clean package"
        sh "mv target/*.jar target/game.jar"
        }
    }

    }
}
