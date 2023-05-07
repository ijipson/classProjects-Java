//Izabel Jipson
//Months and Days Program
//This program takes a user's input int and outputs the corresponding month and the number of days in that month
//February 8, 2022

//import scanner
import java.util.Scanner;

public class months_days {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
//Initializing variables
		int num, days = 0;
		String month = null;
		
//Getting user's input integer from 1-12
		System.out.print("Enter a number between 1-12.");
		num=input.nextInt();
		
//Switch case to assign each number a month 
		switch (num) {
		case 1:
			month="January";
			break;
		case 2:
			month="February";
			break;
		case 3:
			month="March";
			break;
		case 4:
			month="April";
			break;
		case 5:
			month="May";
			break;
		case 6:
			month="June";
			break;
		case 7:
			month="July";
			break;
		case 8:
			month="August";
			break;
		case 9:
			month="September";
			break;
		case 10:
			month="October";
			break;
		case 11:
			month="November";
			break;
		case 12:
			month="December";
			break;
		default:
			break;
		}
		
//switch case to assign each month with corresponding days in that month
		switch (num) {
		case 4: case 6: case 9: case 11:
			days = 30;
			break;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			days=31;
			break;
		case 2:
			days=28;
			break;
		default:
			break;
		}
		
//prints final statement of the month and days of that integer
		if (month!=null)
		System.out.format("\n %s has %d days!",month,days );
		else {
			System.out.println("\nInvalid input please try again!");
		}
		
		
//closes scanner
		input.close(); 
	}

}
