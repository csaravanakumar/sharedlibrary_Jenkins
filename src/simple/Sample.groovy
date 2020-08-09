
package simple
import java.time.*
class Sample implements Serializable {
	def script
	Sample(script)
	{
		this.script=script
	}
	def logHelloWorld() {
		print("hello world")
	}
	def printHello() {
	        print("hello world from library")
	}
	def date_tine(){
	 def now = LocalDateTime.now()
         println now
	}
	
}


