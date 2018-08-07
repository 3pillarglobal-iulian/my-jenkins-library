def deleteFolder() {
    def gitDir = System.getenv('JENKINS_HOME') + "/workspace/git"
    File folder = new File(gitDir)

    if(!folder.deleteDir()) {
        println("Error on deleting folder")
    }
}

def call() {
    deleteFolder()
}