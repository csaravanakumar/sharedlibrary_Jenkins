
package simple

class Sample implements Serializable {
	def script
	Sample(script)
	{
		this.script=script
	}
	def logHelloWorld() {
		sh 'echo "hello world"'
	}
	def printHello() {
	sh 'echo "hello world from library"'
	}
}


