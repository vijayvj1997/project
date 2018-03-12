pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Stage Build'
      }
    }
    stage('Acceptance') {
      steps {
        echo 'Stage Acceptance'
      }
    }
    stage('Integration') {
      steps {
        echo 'Stage Integration'
      }
    }
    stage('UAT') {
      steps{
        parallel(
          "Test" : {
            echo 'Stage Test'
          }
          "Performance" : {
            echo 'Stage Performance'
          }
          "Trigger" : {
            echo 'Stage Trigger'
            echo 'Triggering a new Job'
            build 'new'
          }
          )
      }
    }
    stage('Public') {
      steps {
        echo 'Stage Public'
      }
    }
  }
}
