fun mergeSortProper(numberList: IntArray, low: Int, high: Int): IntArray{
	divideCounter = divideCounter + 1
	if(low<high){
		val middle: Int = (low + high) / 2
		mergeSortProper(numberList, low, middle)
		mergeSortProper(numberList, middle+1, high)
		merge(numberList, low, middle, high)
	}
	return numberList
}

fun merge(mergeList: IntArray, low: Int, mid: Int, high: Int){
		val leftSize: Int = mid - low + 1
		val rightSize: Int = high - mid
		val leftArray: IntArray
		val rightArray: IntArray
		val i: Int = 0
		
		leftArray =  arrayOfNulls(leftSize+1)
		rightArray = arrayOfNulls(rightSize + 1)
		
		while(i<leftSize){
			leftArray[i] = mergeList[low + i]
			i = i + 1
		}
		
		i = 0
		while(i<rightSize){
			rightArray[i] = mergeList[mid + i + 1]
		}

		val sentinel: Int = 2147483647 
		leftArray[leftSize] = sentinel
		rightArray[rightSize] = sentinel

		val leftIndex: Int = 0
		val rightIndex: Int = 0
		val temp1: Int = 0
		val temp2: Int = 0
		i = low
		while(i<=high){
			temp1 = leftArray[leftIndex]
			temp2 = rightArray[rightIndex]
			if(temp1 <= temp2) {
				mergeList[i] = leftArray[leftIndex];
				leftIndex = leftIndex + 1
			}
			else {
				mergeList[i] = rightArray[rightIndex];
				rightIndex = rightIndex + 1
			}
		}
		
		conquerCounter = conquerCounter + 1
	}

fun main(args : StringArray) {
	val divideCounter: Int = 0
	val conquerCounter: Int = 0
	val myArr: IntArray
	val sortedArr: IntArray
	val n: Int = 0
	val count: Int = 0
	val low: Int = 0
	val high: Int
	scan("How many numbers? "+n)
	myArr = arrayOfNulls(n)
	sortedArr = arrayOfNulls(n)
	while(count<n){
		scan("Enter number: "+myArr[count])
		count = count + 1
	}
	high = n-1
	sortedArr = mergeSortProper(myArr,low,high)
	print("Sorted num using merge sort:")
	count = 0
	while(count<n){
		print(" "+sortedArr[count])
		count = count + 1
	}
	println("")
	print("Divide steps: "+divideCounter)
	println(" Conquer steps: "+conquerCounter)
	
}
