fun main(args : StringArray) {
	val name: String = ""
	val age: Int = 0
	val thesis: String = ""

	scan("Enter your name: " +name)
	print("Welcome " +name+ "!")
	scan("Enter your age: "+age)
	print("You have been identified as "+name+" with age of "+age+"!")
	print("Answer this security question!")
	scan("What's the title of your thesis? Answer: "+thesis)
	print("You entered "+thesis+"! Access granted!")

}