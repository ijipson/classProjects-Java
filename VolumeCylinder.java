//Izabel Jipson
//Volume Program
//This program calculates volume and surface area of a cylinder
//January 30, 2022


import java.util.Scanner;
public class VolumeCylinder {

	public static void main(String[] args) {
		//opens scanner
		Scanner input=new Scanner(System.in);
		
		//defines pi as a constant
		final double pi=3.14;
		double radius, height, surfaceArea, volume;
		//asks for input for radius and height measurements
		System.out.print("Enter the radius: ");
		radius= input.nextDouble();
		System.out.print("Enter the height: ");
		height= input.nextDouble();
		//calculates and prints surface area and volume based on inputs
		surfaceArea=(2*pi*radius*height)+(2*pi*radius*radius);
		volume=pi*(radius*radius)*height;
		System.out.println("The surface area of the cylinder is "+surfaceArea);
		System.out.println("The volume of the cylinder is "+volume);
		//closes scanner
		input.close(); 
	}

}
