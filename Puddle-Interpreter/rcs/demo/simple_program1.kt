fun main(args : StringArray) {
	val temp: Int = 0

	scan("Enter temperature: "+temp)
	if(temp<20)
		print("IT'S COLD!")
	else if(temp>30)
		print("IT'S HOT")
	else
		print("COOL CLIMATE!")
}