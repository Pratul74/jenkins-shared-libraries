def call(String imageTag, String dockerFileLocation){
  sh "docker build -t ${imageTag} ${dockerFileLocation}"
}
