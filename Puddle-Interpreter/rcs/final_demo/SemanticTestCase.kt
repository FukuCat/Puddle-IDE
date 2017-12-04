fun assertNonZero(x:Int): Boolean{
	if(x>0){
		return true
	}
	//error #1
}

fun sayHelloWorld(){
	print("Hello World")
}

//error #2
fun sayHelloWorld()  {
	print("Hello World")
}

fun arrayTest(size_1:Int, size_2:Int){
	var simpleArray : IntArray = arrayOfNulls(size_1)
	var simpleArray : IntArray = arrayOfNulls(size_2) //error #3
	var simpleArray_2 : IntArray = arrayOfNulls(2f) //error #4

	var complexArraySize: Int = (size_1*2) - size_2 - 4
	var complexArray: IntArray = arrayOfNulls(complexArraySize)

	for(i: Int in 0..complexArraySize){
		complexArraySize[i] = i
	}

	return complexArray //error #5
}

fun main(args: StringArray){

	val ERROR_CODE: Int = 404

	var x: Int = 0
	var y: Int = 5
	var z: Int = 0f

	z = asserNonZero(x) //error #6
	print("Test error print of code " +ERROR_CODE)
	ERROR_CODE = 500 //error #7

	if(z>0){
		print("Computated value: " + someValue()) //error #8
	}

	var z: Int = 0
	var x: Int = 0 //error #9, #10


}
