#!/usr/bin/env groovy

job('Hello World') {
    steps {
        shell('echo "Hello World!"')
    }
}
