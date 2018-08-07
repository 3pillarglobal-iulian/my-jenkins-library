
def isStageSkipable(String stageName) {
    def gitDir = System.getenv('JENKINS_HOME') + "/workspace/git"

    println(gitDir)

    File folder = new File(gitDir)
    File[] listOfFiles = folder.listFiles()

    for (File file : listOfFiles) {
        if (file.getName().equals(stageName))
            return false
    }
    return true
}

def call(String stageName) {
   return isStageSkipable(stageName)
}