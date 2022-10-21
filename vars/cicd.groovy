def newGit(repo)
{  
  git "${repo}"
}

def newMaven()
{
  sh 'mvn package'
}
def newDeploy(jobname,ip,context)
{
  sh "scp /var/lib/jenkins/workspace/${jobanme}/webapp/target/webapp.war ubuntu@${ip}:/war/lib/tomcat9/webapps/${context}.war"
}
