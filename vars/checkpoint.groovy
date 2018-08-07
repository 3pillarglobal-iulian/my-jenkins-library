
def previousBuildStageSuccess(String stageName) {
    def dir = System.getenv('JENKINS_HOME') + "/workspace/tmp@checkpoint"

    File folder = new File(dir)
    File[] listOfFiles = folder.listFiles()

    for (File file : listOfFiles) {
        if (file.getName().equals(stageName))
            return false
    }
    return true
}

def call(String stageName) {
   return previousBuildStageSuccess(stageName)
}
