fun main(args : StringArray) {
	val n: Int = 0
	val total: Int = 0
	val temp: Int = 0
	val count: Int = 0
	val myArr: CharArray
	scan("How many numbers do you want to enter? "+n)
	for(i: Int in 0..n) {
		scan("Enter number: "+temp)
		total = total + temp
	}
	println("You have an array of characters with size of "+total)
	myArr = arrayOfNulls(total)
	while(count<total){
		scan("Enter character: "+myArr[count])
		count = count + 1
	}
	count = 0
	while(count<total){
		print(""+myArr[count])
		count = count + 1
	}
	println("")
}
