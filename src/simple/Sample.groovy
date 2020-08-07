
package simple.Sample

class Sample {
	def logHelloWorld() {
		sh 'echo "hello world"'
	}
}

def printHello() {
	sh 'echo "hello world from library"'
}
