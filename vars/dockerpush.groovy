def call(String credentialsId, String usernameVariable, String passwordVariable, String imageTag){
  withCredentials([usernamePassword(credentialsId: credentialsId, usernameVariable: usernameVariable, passwordvariable: passwordVariable)]){
    sh "docker login -u ${usernameVariable} -p ${passwordVariable}"
    sh "docker push usernameVariable/${imageTag}"
  }
}
