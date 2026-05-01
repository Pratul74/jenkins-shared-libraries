def call(String credentialsId, String variable){
  withCredentials([file(credentialsId: credentialsId, variable: variable)]){
    sh '''
      if [ ! -f .env ]; then
        cp $''' + variable + ''' .env
      fi
    '''
    sh "docker compose up --build -d"
  }
}
