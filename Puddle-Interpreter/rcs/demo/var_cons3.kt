fun main(args : StringArray) {
	const val JUNGLE_CUBES: Int = 1
	const val DRAGON_CUBES: Int = 2
	const val JUICE_CUBES: Int = 3
	const val BUBBLE_CUBES: Int = 4
	const val FARM_CUBES: Int = 5
	const val LOST_CUBES: Int = 6
	
	val number: Int = 0
	scan("Enter number: "+number)
	
	if(JUNGLE_CUBES == number) {
		print("Jungle Cubes!")
	}
	if(DRAGON_CUBES == number) {
		print("Dragon Cubes!")
	}
	if(JUICE_CUBES == number) {
		print("Juice Cubes")
	}
	if(BUBBLE_CUBES == number) {
		print("Bubble Cubes")
	}
	if(FARM_CUBES == number) {
		print("Farm Cubes")
	}
	if(LOST_CUBES == number) {
		print("Lost Cubes")
	}
}