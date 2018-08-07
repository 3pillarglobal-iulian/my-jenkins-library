
def createStageNameFiles (String jenkinsHome, String stageName) {
    def gitDir = jenkinsHome + "/workspace/git"

    if(!f_gitDir.exists()){
        f_gitDir.mkdirs()
    }

    File folder = new File(gitDir)
    File[] listOfFiles = folder.listFiles()

    boolean fileExist = false

    for (File file : listOfFiles) {
        if (file.getName().equals(stageName)) {
            fileExist = true
        }
    }

    if (!fileExist) {
        def newFile = new File(gitDir + "/" + stageName)
        newFile.createNewFile()
    }
}

def call(String jenkinsHome, String stageName) {
    createStageNameFiles(jenkinsHome, stageName)
}