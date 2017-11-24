fun main(args : StringArray) {
	val ass1: Int = 0
	val ass2: Int = 0
	val ass3: Int = 0
	val average: Float = 1.0f

	scan("Enter assignment 1 grade: "+ass1)
	scan("Enter assignment 2 grade: "+ass2)
	scan("Enter assignment 3 grade: "+ass3)
	ass1 = ass1*40
	ass2 = ass2*35
	ass3 = ass3*25
	average = ass1 + ass2 + ass3
	average = average/100
	if(average>=94)
		print("Your grade is "+average+". Your DLSU grade is: 4.0.")
	else if(average>=89)
		print("Your grade is "+average+". Your DLSU grade is: 3.5.")
	else if(average>=83)
		print("Your grade is "+average+". Your DLSU grade is: 3.0.")
	else if(average>=78)
		print("Your grade is "+average+". Your DLSU grade is: 2.5.")
	if(average>=72)
		print("Your grade is "+average+". Your DLSU grade is: 2.0.")
	else if(average>=66)
		print("Your grade is "+average+". Your DLSU grade is: 1.5.")
	else if(average>=60)
		print("Your grade is "+average+". Your DLSU grade is: 1.0.")
	else
		print("Your grade is "+average+". Your DLSU grade is: 0.0.")
}