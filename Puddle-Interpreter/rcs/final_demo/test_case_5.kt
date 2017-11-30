fun main(args : StringArray) {
	val n: Int = 0
	val header: Int = 1
	val innercontent: Int = 1
	val outercontent: Int = 1
	val temp: Int = 1
	scan("Enter table size: "+n)
	println("")
	print("  ")
	while(header<n+1){
		print("     "+header)
		header = header+1;
	}
	println("")
	while(outercontent<n+1){
		print(""+outercontent)
		innercontent = 1
		while(innercontent<n+1){
			temp = outercontent * innercontent
			if(temp>9){
				print("   "+temp)
			}
			else if(temp>99){
				print(" "+temp)
			}
			else{
				print("     "+temp)
			}
			innercontent = innercontent + 1
		}
		println("")
		outercontent = outercontent + 1
	}
}
