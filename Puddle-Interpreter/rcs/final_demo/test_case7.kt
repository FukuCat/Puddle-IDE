fun count7(n: Int):Int {
  if (n<1){
	return 0
  }
  if(n%10 == 7){
	return 1 + count7(n/10)
  }
  else{
	return count7(n/10)
  }
}

fun main(args : StringArray) {
	val n: Int = 0
	scan("Enter number: "+n)
	n = count7(n)
	println("Number of 7's: "+n)
}
