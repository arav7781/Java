//Calculator.java
class Calculator{
	int sum(){
		UserInput ui = new UserInput();
		int[] numbers = ui.UserInput();
		int sum = numbers[0] + numbers[1];
		return sum;
	}
	
	int division(){
		UserInput ui = new UserInput();
		int[] numbers = ui.UserInput();
		int sum = numbers[0]/numbers[1];
		return sum;
	}
	int product(){
		UserInput ui = new UserInput();
		int[] numbers = ui.UserInput();
		int sum = numbers[0]*numbers[1];
		return sum;
	}
	
}
