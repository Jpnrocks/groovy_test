def gv

pipeline {
	agent any
	stages{
		stage("build")
		{
			steps{
				script{
					gv = load "script.groovy"
				}
			}
		}
		stage("build")
		{
			steps{
				echo "checking build"
			}
		}
		stage("test")
		{
			steps{
				script{
					gv.thankyou()
				}
				echo "testing"
			}
		}
	}
}
