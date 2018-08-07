
def isStageSkipable(String jenkinsHome, String stageName) {
    def gitDir = jenkinsHome+ "/workspace/git"

    File folder = new File(gitDir)
    File[] listOfFiles = folder.listFiles()

    for (File file : listOfFiles) {
        if (file.getName().equals(stageName))
            return true
    }
    return false
}

def call(String jenkinsHome, String stageName) {
   return isStageSkipable(jenkinsHome, stageName)
}