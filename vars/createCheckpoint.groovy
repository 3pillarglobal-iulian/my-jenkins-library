
def createStageNameFiles (String jobName, String stageName) {
    def dir = System.getenv('JENKINS_HOME') + "/workspace/" + jobName +"@checkpoint"
    def f_dir = new File(dir)

    if(!f_dir.exists()){
        f_dir.mkdirs()
    }

    File folder = new File(dir)
    File[] listOfFiles = folder.listFiles()

    boolean fileExist = false

    for (File file : listOfFiles) {
        if (file.getName().equals(stageName)) {
            fileExist = true
        }
    }

    if (!fileExist) {
        def newFile = new File(dir + "/" + stageName)
        newFile.createNewFile()
    }
}

def call(String jobName, String stageName) {
    createStageNameFiles(jobName, stageName)
}
