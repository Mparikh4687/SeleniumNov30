package demo;

public class Car {
	public static void main(String[] args) {
		Calculator basicCal = new Calculator();
		Car audi = new Car();
		
		int numberOfCars = 5;
		String colorOfCar = "Blue";
		String myFavoriteColor = "My favorite color is yellow";
		char doIHaveMerc = 'N';
		float widthOfCar = 123.23f;
		double heightOfCar = 3.45678;
		
		System.err.println("Color of my car is " + colorOfCar);
		basicCal.subNumbers(50, 20);
	}
}
