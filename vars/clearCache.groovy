def deleteFolder() {
    def dir = System.getenv('JENKINS_HOME') + "/workspace/" + System.getenv('JOB_NAME') + "@checkpoint"
    File folder = new File(dir)

    if(!folder.deleteDir()) {
        println("Error on deleting folder")
    }
}

def call() {
    deleteFolder()
}