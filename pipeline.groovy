#!/usr/bin/env groovy

pipelineJob('example-pipeline') {
  definition {
    cps {
      script('''
        pipeline {
          agent any
            stages {
              stage ('Build') {
                steps {
                  echo 'Build phase'
                }
              }
              stage ('Unit tests') {
                echo 'Unit testing phase'
              }
              stage ('Deploy') {
                echo 'Deploy phase'
              }
            }
        }
      '''.stripIndent())
      sandbox()
    }
  }
}
