fun main(args : StringArray) {
	val a: Int = 0
	val x: Int = 0
	val total: Int = 0
	
	scan("Enter a: "+a)
	scan("Enter x: "+x)
	total = a
	for(i: Int in 1..x) {
		total = total*a
	}
	print("Result: "+total)
}