def newGit(repo)
{
  git "https://github.com/rajathiragavendran/${repo}"
}

def newmaven()
{
   sh 'mvn package'
}
