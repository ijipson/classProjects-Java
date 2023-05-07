//Izabel Jipson
//Circle Exercise
//April 19, 2023
public class TryCircle {

	public static void main(String[ ] args) {

		// Create a circle with radius 1
		Circle coaster = new Circle(1);		// no arguments - creates the default circle
		System.out.println("The area of the circle of radius " +
				coaster.radius + " is " + coaster.getArea());
		
		// Create a circle with radius 25
		Circle hulahoop = new Circle(25);
		System.out.println("The area of the circle of radius " +
				hulahoop.radius + " is " + hulahoop.getArea());
		
		// Create a circle with radius 125 and show the area - you write this!
		Circle kiddiepool = new Circle(125);
		System.out.println("The area of the circle of radius " +
				kiddiepool.radius + " is " + kiddiepool.getArea());

		
		// Modify radius of circle2 and get new area
		hulahoop.setRadius(100);
		System.out.println("The area of the circle of radius " + 
				hulahoop.radius + " is " + hulahoop.getArea());
		
		// Modify radius of circle3 and get new area - you write this!
		kiddiepool.setRadius(150);
		System.out.println("The area of the circle of radius " + 
				kiddiepool.radius + " is " + kiddiepool.getArea());



	}
}

