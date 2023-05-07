//Izabel Jipson
//Loop Practice
//Use 3 different types of loops
//February 27, 2022

//imports scanner
import java.util.Scanner;
public class loopPractice {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
//Use a while loop to ask for a password.  Don’t end the loop until the person puts in the correct password. 
//(Password of your choice.)  Print that access is granted.

//gets user input
		String password = "null";
		System.out.println("\nEnter the password.");
		password= input.nextLine();
		
//starts while loop until correct password is entered
		while (!password.equals("ladybug")) {
			System.out.println("\nThe password you have entered is incorrect please try again.");
			System.out.println("\nEnter the password.");
			password= input.nextLine();
			
		}
		
//Prints Access Granted when correct password is entered
		System.out.println("Access Granted");
		
//Use a do-while loop to redo the coffee loop. 
//Your coffee starts at 195 degrees.  Assume anything above 130 degrees is too hot and that adding an ice chip lowers the temperature by 2 degrees.  
//Tell me when it is safe to drink my coffee and how many ice chips were added to get to a safe temperature.

//Initialize variables
		int coffee=195,icechip = 2,cnt=0;

//starts do-while loop to get coffee down to 130 degrees 
		 do{
			coffee= coffee-icechip;
			cnt++;
		}
		 while (coffee>130);
		 
//Prints how many icechips used and that coffee is safe once 130 degrees
		System.out.format("\nYour coffee is now safe to drink %d icechips have been added!",cnt);
		
//Uses a for loop to print the squares and cubes of all the integers from 10 down to 1.
		for (int i=1;i<=10;i++ ) {
			int cube, square;
			cube=i*i*i;
			square=i*i;
			System.out.format("\n\n%d,%d",square, cube);
		}
		
//closes scanner
		

	}

}
	