package demo;

public class Calculator {
	public static void main(String[] args) {
		Calculator basicCal = new Calculator();
		basicCal.addNumbers(20, 30);
	}
	
	public void addNumbers (int num1, int num2) {
		int sum = num1 + num2;
		System.err.println(sum);
	}
	
	public void subNumbers (int num1, int num2) {
		int sub = num1 - num2;
		System.err.println(sub);
	}

}
