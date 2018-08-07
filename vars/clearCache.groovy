def deleteFolder() {
    def dir = System.getenv('JENKINS_HOME') + "/workspace/" + "$JOB_BASE_NAME@checkpoint"
    File folder = new File(dir)

    if(!folder.deleteDir()) {
        println("Error on deleting folder")
        return false
    }
    return true
}

def call() {
    return deleteFolder()
}