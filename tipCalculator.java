//Izabel Jipson
//Tip Calculator
//This program calculates 10,15, and 20 percent tip of inputed subtotal
//February 2, 2023

//Opens scanner
import java.util.Scanner;
public class tipCalculator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		
//Floats and defines all integers
		double subtotal,tipA,tipB,tipC;
		
//Gets subtotal input from user
		System.out.print("Enter the subtotal: ");
		subtotal= input.nextDouble();
		
//Multiples each subtotal by specified tip percent and saves to variable
		tipA=subtotal*0.10;
		tipB=subtotal*0.15;
		tipC=subtotal*0.20;
		
//Prints formatted list of each tip and full total after tip
		System.out.format("\nAt 10%% the tip is: $%.2f and the total is: $%.2f\n", tipA, subtotal+tipA);
		System.out.format("\nAt 15%% the tip is: $%.2f and the total is: $%.2f\n",tipB, subtotal+tipB);
		System.out.format("\nAt 20%% the tip is: $%.2f and the total is: $%.2f\n",tipC, subtotal+tipC);
		
//Closes scanner
		input.close(); 
	}

}
