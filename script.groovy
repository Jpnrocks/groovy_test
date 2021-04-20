def thankyou(){
  node("linux-repo-1"){
     echo "Thank you"
     sh script: "pwd"
  }
}
return this
