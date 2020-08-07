
package simple

class Sample implements Serializable {
	def script
	Sample(script)
	{
		this.script=script
	}
	def logHelloWorld() {
		echo("hello world")
	}
	def printHello() {
	echo("hello world from library")
	}
}


