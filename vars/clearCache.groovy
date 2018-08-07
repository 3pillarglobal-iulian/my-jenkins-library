def deleteFolder(String jobName) {
    def dir = System.getenv('JENKINS_HOME') + "/workspace/" + jobName +"@checkpoint"
    File folder = new File(dir)

    if(!folder.deleteDir()) {
        println("Error on deleting folder")
        return false
    }
    return true
}

def call(String jobName) {
    return deleteFolder(jobName)
}