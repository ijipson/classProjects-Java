//Izabel Jipson
//Craps Games
//This project randomly rolls two dice and you win if you roll a 7 or 11
//March 15, 2023

//imports scanner and random libraries
import java.util.Scanner;
import java.util.Random;
public class craps {

	public static void main(String[] args) {
		
//initializes scanner and random
	Scanner input = new Scanner(System.in);
	Random roll= new Random();

//initializes variables
		int dice1, dice2,total;

//getting random integers between 1-6 for two dice 
		dice1= roll.nextInt((6-1)+1)+1;
		dice2= roll.nextInt((6-1)+1)+1;
		
//getting total of two dice every roll
		total= (dice1+dice2);
		
//prints the roll of each die and combined total
		System.out.format("You rolled a %d & %d \nYour total is %d", dice1, dice2,total);

//uses if statement to tell user whether they won or lost (win is if total= 7 or 11 everything else is a lose)
		if (total==7 || total==11) {
			System.out.println("\nYou win! :)");
		}
		
		else{
			System.out.println("\nYou lose :(");	
		}

//closes scanner
		input.close();
	}

}
