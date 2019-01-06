//Blackjack
def blackjack(a:Int,b:Int){
	if(a>21 && b>21){
		println(0)
	}else if(a > b){
		print(a)
	}else{
		print(b)
	}
}

blackjack(18,21)

//UniqueSum
def uniqueSum(num1:Int,num2:Int,num3:Int){
	var amount = 0
	if(num1 == num2 && num2 == num3){
		println(0)
	}else if(num1 == num2){
		amount = num3
	}else if(num2 == num3){
		amount = num1
	}else if(num1 == num3){
		amount = num2
	}else{
		amount = num1 + num2 + num3
	}
	println(amount)
}

uniqueSum(2,3,2)



