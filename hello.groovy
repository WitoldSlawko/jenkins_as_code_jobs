#!/usr/bin/env groovy

job {
    name 'hello-world'
    steps {
        shell('echo "Hello World!"')
    }
}
