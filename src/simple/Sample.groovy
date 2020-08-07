
package simple

class Sample implements Serializable {
	def script
	Sample(script)
	{
		this.script=script
	}
	def logHelloWorld() {
		print "hello world"
	}
	def printHello() {
	print "hello world from library"
	}
}


