def deleteFolder() {
    def dir = System.getenv('JENKINS_HOME') + "/workspace/tmp/@checkpoint"
    File folder = new File(dir)

    if(!folder.deleteDir()) {
        println("Error on deleting folder")
    }
}

def call() {
    deleteFolder()
}