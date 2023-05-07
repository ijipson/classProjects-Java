//Izabel Jipson
//Rectangle Exercise
//April 19, 2023

public class tryRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle tissuebox = new Rectangle(1,2);		// no arguments - creates the default circle
		System.out.println("The area of the rectangle of length " +
				tissuebox.length + " and width "+ tissuebox.width +" is " + tissuebox.getArea());
		
		
		// Create a circle with radius 25
		Rectangle whiteboard = new Rectangle(25, 20);
		System.out.println("The area of the rectangle of length " +
				whiteboard.length + " and width "+ whiteboard.width +" is " + whiteboard.getArea());
		
		// Create a circle with radius 125 and show the area - you write this!
		Rectangle lawn = new Rectangle(125, 100);
		System.out.println("The area of the rectangle of length " +
				lawn.length + " and width "+ lawn.width +" is " + lawn.getArea());

		
		// Modify radius of circle2 and get new area
		whiteboard.setLength(100,10);
		System.out.println("The area of the rectangle of length " +
				whiteboard.length + " and width "+ whiteboard.width +" is " + whiteboard.getArea());

		
		// Modify radius of circle3 and get new area - you write this!
		lawn.setLength(150,50);
		System.out.println("The area of the rectangle of length " +
				lawn.length + " and width "+ lawn.width +" is " + lawn.getArea());



	}
}

