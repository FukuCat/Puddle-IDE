fun main(args : StringArray) {
	val ch: String = ""
	val fontsize: Int = 0
	val f: String = "F"
	val t: String = "T"
	val l: String = "L"
	val outerloop: Int = 0
	val innerloop: Int = 0

	do{
		scan("Enter char: " +ch)
		if(ch != f&&ch!=t&&ch!=l){
			println("INVALID! Only supports 'FTL.' Please try again")
		}
	}while(ch != f&&ch!=t&&ch!=l)
	do{
		scan("Enter font size: "+fontsize)
		if(fontsize<5){
			println("INVALID! Font size should be atleast 5.")
		}
	}while(fontsize<5)
	val middle: Int = fontsize/2
	if(ch==f){
		while(outerloop<fontsize){
			if(outerloop==0){
				innerloop = 0
				while(innerloop<fontsize-1){
					print("*")
					innerloop = innerloop + 1
				}
			}
			if(outerloop==middle){
				innerloop = 0
				while(innerloop<=fontsize/2){
					print("*")
					innerloop = innerloop + 1
				}
			}
			println("*")
			outerloop = outerloop + 1
		}
	}
	if(ch==t){
		outerloop = 0
		while(outerloop<fontsize){
			if(outerloop==0&&ch==t){
				innerloop = 0
				while(innerloop<fontsize){
					print("*")
					innerloop = innerloop + 1
				}
				println("*")
			}
			if(outerloop>0&&ch==t){
				println("   *")
			}
			
			outerloop = outerloop + 1
		}
	}
	if(ch==l){
		outerloop = 0
		while(outerloop<fontsize){
			if(outerloop==fontsize-1){
				innerloop = 0
				while(innerloop<fontsize-1){
					print("*")
					innerloop = innerloop + 1
				}
				println("*")
			}
			if(outerloop<fontsize-1){
				println("*")
			}
			
			outerloop = outerloop + 1
		}
	}
}