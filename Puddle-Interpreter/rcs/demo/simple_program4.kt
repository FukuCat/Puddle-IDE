fun main(args : StringArray) {
	val num1: Int = 0
	val num2: Int = 0
	val num3: Int = 0

	scan("Gimme number: "+num1)
	scan("Gimme number: "+num2)
	scan("Gimme number: "+num3)
	
	if(num1>num2 && num1>num3)
		print("Highest number entered is "+num1+"!")
	else if(num2>num1 && num2>num3)
		print("Highest number entered is "+num2+"!")
	else
		print("Highest number entered is "+num3+"!")
}