
def previousBuildStageSuccess(String jobName, String stageName) {
    def dir = System.getenv('JENKINS_HOME') + "/workspace/" + jobName + "@checkpoint"

    println(System.getenv('JOB_BASE_NAME'))

    File folder = new File(dir)
    File[] listOfFiles = folder.listFiles()

    for (File file : listOfFiles) {
        if (file.getName().equals(stageName))
            return false // do stage
    }
    return true // skip stage
}

def call(String jobName, String stageName) {
   return previousBuildStageSuccess(jobName, stageName)
}
