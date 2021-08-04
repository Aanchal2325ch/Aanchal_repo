pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Build SuccessFul'
        echo 'Done'
        sleep 1
      }
      steps {
        echo 'Build2 SuccessFul'
        echo 'Done2'
        
      }
    }

    stage('Test') {
      steps {
        echo 'Test successful'
      }
    }

    stage('Deploy') {
      steps {
        echo 'Deploy Successful'
      }
    }

    stage('End') {
      steps {
        echo 'Successfully executed'
      }
    }

  }
}
