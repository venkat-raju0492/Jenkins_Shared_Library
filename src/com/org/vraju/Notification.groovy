
package com.org.vraju			
def email(){				
  script{
  	emailext (
   	 body: '''${SCRIPT, template="email-html-dm.template"}''',
	mimeType: 'text/html',
	to: "${env.MAIL}",
	subject: "[JENKINS] ${env.JOB_NAME}")
  }
}
