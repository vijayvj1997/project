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
    stage('Parallel') {
      parallel {
        stage('Test') {
          steps {
            echo 'Stage Test'
          }
        }
        stage('Performance') {
          steps {
            echo 'Stage Performance'
          }
        }
        stage('Trigger') {
          steps {
            echo 'Stage Trigger'
            echo 'Triggering a new Job'
            build 'new'
          }
        }
      }
    }
    stage('Public') {
      steps {
        echo 'Stage Public'
      }
    }
  }
}