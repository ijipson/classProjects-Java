//Izabel Jipson
//Rectangle Exercise
//April 19, 2023

// Define the circle class with two constructors
public class Rectangle {
	double length, width;		// This is the only property for a Circle
	
	/* Construct a circle with radius 1 - the default circle */
	Rectangle() {
		length = 1;
		width= 2 ;
	}
	
	/* Construct a circle with specified radius */
	Rectangle(double newLength, double newWidth) {
		length = newLength;
		 width = newWidth;
	}
	
	/* Methods */
	
	/* Return the area of the circle */
	double getArea() {
		return length * width;
	}
	
	/* Return the perimeter of the circle */
	double getPerimeter() {
		return ((2 * length)+ (2* width)) ;
	}
	
	/* Set the radius for the circle */
	void setLength(double newLength, double newWidth) {
		length = newLength;
		width = newWidth;
	}
}
