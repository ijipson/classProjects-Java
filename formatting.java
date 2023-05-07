//Izabel Jipson
//Formatting Practice
//February 1, 2023
public class formatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14159;
		int num1= 53, num2 = 25;
		String food = "pizza";

		System.out.format("An integer left: %-5d \nAn integer right: %3d", num1, num2);
		System.out.format("\nThis is PI: %.2f", PI);
		System.out.format("\nThis is PI too: %3.4f", PI);
		System.out.format("\nA String right: %12s", food);
		System.out.format("\nA String left: %-12s", food);



	}

}
