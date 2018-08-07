
def createStageNameFiles (String stageName) {
    def gitDir = "$JENKINS_HOME" + "/workspace/git"
    def f_gitDir = new File(gitDir)

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

def call(String stageName) {
    createStageNameFiles(stageName)
}