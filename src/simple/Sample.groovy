
package simple

class Sample implements Serializable {
	def script
	Sample1(script)
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


