def call(String credentialsId, String variable){
  withCredentials[file(credentialsId: "${credentialsId}", variable: "${variable}")]{
    sh "sudo rm "${variable}" && sudo cp "${variable}" .
    sh "docker compose up --build -d"
  }
}
