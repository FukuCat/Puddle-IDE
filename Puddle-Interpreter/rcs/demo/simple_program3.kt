fun main(args : StringArray) {
	val num: Int = 0
	val total: Int = 0

	while(num>-1){
		scan("Gimme number: "+num)
		total = total + num
	}
	total = total + 1
	print("Total: "+total)
}