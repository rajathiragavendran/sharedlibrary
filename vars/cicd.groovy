def newGit(repo)
{
  git "https://github.com/rajathiragavendran/${repo}"
}

def newmaven()
{
   sh 'mvn package'
}

def runselenium(pname)
{
  sh "java -jar /var/lib/jenkins/workspace/${pname}/testing.jar"
}
