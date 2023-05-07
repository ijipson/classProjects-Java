//Izabel Jipson
//Conversion Program
//Converts pounds to kilograms and vice versa using while and for loop
//March 8, 2022

//imports scanner
import java.util.Scanner;
public class conversion {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
//formats table to print kg on left and lb on right
	System.out.println("Kilograms   Pounds");
	System.out.println("__________________");
	
//for loop to print kg converted to lb
	for (int i=1;i<200;i++) {
		double kg;
		int lb;
		lb=i;
		kg=lb*2.2;
		
//if loop to only print odd numbers
		if (lb%2!=0) {
		System.out.format("%d           %.1f\n",lb,kg);
		}
	}

//initializing variables and formatting table for lb to kg section
	int lb = 15;
	double kg;
	System.out.println("\nPounds   Kilograms");
	System.out.println("__________________");
	
//while loop to convert lb to kg from range 15<i<515
	while (lb>=15 && lb<=510) {
		kg=lb/2.2;
		lb=lb+5;	
		System.out.format("%d          %.2f\n", lb, kg);
	}
	
//closes scanner
		input.close();  

	}

	
}

