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
      parallel {
        stage('UAT') {
          steps {
            echo 'Stage UAT'
          }
        }
        stage('Performance') {
          steps {
            echo 'Stage Performance'
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