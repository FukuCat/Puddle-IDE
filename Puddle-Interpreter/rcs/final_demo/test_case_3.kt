fun main(args : StringArray) {
	val MULTIPLIER: Float = 2.0f
	val DIVIDER: Float = 1.5f
		
	val x: Int = 0 
	val y: Int = 0 
	val z: Int = 0
	
	x = x + 4
	y = y + 5
	z = z + 6
	
	//NOTE: Write this complex expression as is!!
	val finalValue: Float = (((x + y) * MULTIPLIER) / DIVIDER + x + y) - y * MULTIPLIER
	//NOTE: Write this print statement as is!!
	print("Value is: " +(finalValue * MULTIPLIER * MULTIPLIER))
	println("")
}
