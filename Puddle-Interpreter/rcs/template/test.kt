//Convert this into your language rule syntax.

var x: Int = 0
//val z: Float = 0.1 // No viable alternative input error

fun main(args : StringArray) {
    val x: Int = 0
	val x: Int = 0
	val _veryWeirdIdentifier567: Float = 999.9f
	val y: Boolean = (5 > 4 && true) || (false && !(x==0))
	val myArray: IntArray = kotlin.IntArray(10)

	//scan("What is the input: " +x)
	println("Input: " +x)
	
	for(i: Int in 1..5) {
		print("Hello world")
	}
}

class classA {
	fun w(){}
}

class classB constructor(firstName: String) {
    init {

    }
}

class classC constructor(val firstName: String) {

}

class classD: classA {
	fun w(){}
	fun w(x : Int){}
}