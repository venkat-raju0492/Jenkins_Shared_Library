import com.org.vraju.*				
  def call(Map stageParams){
   	s1 = new Notification()			
    
	timeout(time: 240000, unit: 'SECONDS', activity: false) {
	    node("${env.NODE}") {
          try{
          	properties()			
            	stage('Notification') {
                  s1.email()			 
                }
          }
          catch (any) {
	        currentBuild.result = 'FAILED'
          }
        }
    }
  }
