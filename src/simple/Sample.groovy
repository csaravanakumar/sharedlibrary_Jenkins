
package simple.Sample

class Sample1 {
	def logHelloWorld() {
		sh 'echo "hello world"'
	}
}

def printHello() {
	sh 'echo "hello world from library"'
}
