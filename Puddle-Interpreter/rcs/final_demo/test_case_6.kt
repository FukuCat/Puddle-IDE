fun main(args : StringArray) {
	val total: Int = 0
	val count: Int = 0
	val myArr: IntArray
	val i: Int = 1
	val key: Int = 0
	val j: Int = 0
	val temp: Int = 0
	scan("How many numbers? "+total)
	myArr = arrayOfNulls(total)
	while(count<total){
		scan("Enter number: "+myArr[count])
		count = count + 1
	}
	count = 0
	while(i<total){
		key = myArr[i]
		j = i-1
		temp = myArr[j]
		while (j>=0 && temp > key){
			myArr[j+1] = myArr[j]
			j = j-1
			if(j>=0){
				temp = myArr[j]
			}
		}
		myArr[j+1] = key
		i = i + 1
	}
	print("Sorted:")
	count = 0
	while(count<total) {
		print(" "+myArr[count])
		count = count + 1
	}
	println("")
}
