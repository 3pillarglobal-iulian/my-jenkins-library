
METHODS AVAILABLE:
1. checkpoint(String stageName)
2. crateCheckpoint(String stageName)
3. clearCache()

HOW TO USE:

1. checkpoint(String stageName): boolean

Can be used in a stage called in when expression to skip the stage if wanted.

Return true if checkpoint exist, false otherwise.

ex: 
stage('Stage One'){
            when { expression { checkpoint(STAGE_NAME) }
            }
            
            steps{
               ...
            }
}


2. createCheckpoint(String stageName): void

Must be used to create checkpoint of the current stage in order to use checkpoint.

ex:
stage('Stage One'){
            when { expression { checkpoint(STAGE_NAME) }
            }
            
            steps{
                ...
                createCheckpoint (STAGE_NAME)
            }
}
        
3. clearCache(): boolean

Can be used in a stage called in when expression to reset the previously set checkpoints.

Return true if cache is deleted, false otherwise.

ex: 
 stage('Stage One'){
            when { expression { clearCache() }
            }
            
            steps{
                ...
                createCheckpoint (STAGE_NAME)
            }
 }
            
            

