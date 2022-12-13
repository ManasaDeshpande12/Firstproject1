pipeline{


agent any

stages('CI CD Pipeline'){


  stage('Code Checkout'){


    steps{


        script{

            git credentialsId: '0785a37c-780c-4b71-9322-8f503b77cc1b', url: 'https://gitlab.com/05manasa12/Firstproject1.git'


            } 

        }


    }

 

 

  stage('Build'){

 

    steps{

 

        script{

 

            sh "mvn clean install -Dmaven.test.skip=true"

 

        }

 

    }  

 

  }

 

  stage('Test'){

 

    steps{

 

        script{

 

            sh "mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install -Pcoverage-per-test"

 

        }

 

    }  

 

  }

 

  

 

}

 

}
