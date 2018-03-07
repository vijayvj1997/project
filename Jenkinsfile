pipeline{
    agent any
        stages{
            stage('clean'){
                steps{
                   echo 'Clean Stage'
                   bat 'cd C:/Users/kidas/IdeaProjects/project'
                   bat 'gradlew clean'
                }
            }
            stage('compile'){
                            steps{
                                echo 'Compile Stage'
                                bat 'cd C:/Users/kidas/IdeaProjects/project'
                                bat 'gradlew compileJava'
                            }
                        }
            stage('build'){
                            steps{
                                echo 'Build Stage'
                                bat 'cd C:/Users/kidas/IdeaProjects/project'
                                bat 'gradlew build'
                                job 'test2'
                            }
                        }
            stage('test'){
                            steps{
                              echo 'Test Stage'
                              bat 'cd C:/Users/kidas/IdeaProjects/project'
                              bat 'gradlew test'
                            }
                        }
        }
}