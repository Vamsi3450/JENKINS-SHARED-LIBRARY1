def call() {
    withSonarQubeEnv('sonar-server') {
        sh '''
            $SCANNER_HOME/binsonar-scanner \
        -Dsonar.projectKey=youtube \
        -Dsonar.sources=. \
        -Dsonar.host.url=http://98.81.242.166:9000 \
        -Dsonar.login=squ_dc78e4ab5495bbc6fbe315600fda0900769be1c8
        '''
    }
}
