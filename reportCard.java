//Izabel Jipson
//Report Card Program
//This program asks a student for name and grade in three classes and prints a report card with GPA and whether they made the Dean's List

//import scanner and arraylist libraries
import java.util.Scanner;
import java.util.ArrayList;
public class reportCard {

	public static void main(String[] args) {
		
//initialize all variables and libraries
	Scanner input = new Scanner(System.in);
	ArrayList<String> className = new ArrayList<String> ( );
	ArrayList<String> letterGrade = new ArrayList<String> ( );
	ArrayList<Double> points = new ArrayList<Double> ( );
	String studentName = "";
	double gpa = 0.0;

//section to introduce program to user and how it works
	System.out.println("Welcome to the Report Card Program! \n\nTo start please enter the student's name and fill out the following details: the name of the class and the\nletter grade (A/B/C/D/F) that they received in the class.\n\nYou may make as many report cards as needed and to quit simply enter done into the student's name line.");

//section to get user input
	System.out.print("\n\nEnter student's name: ");
	studentName=input.nextLine();
	
//while loop to run until user is finished with program (end command is done) and get user info about class and grades
	while (!studentName.equals("done")) {
		for (int i=0;i<3;i++) {
			System.out.print("\nEnter class name: ");
			className.add(input.nextLine());
			System.out.print("Enter grade: ");
			letterGrade.add(input.nextLine());		
		}
		
//formatting section to print all info in a table
		System.out.format("\n-----------------------------------------------------------\n");
		System.out.format("Student: %s", studentName);
		System.out.format("\nClass                     Grade                     Points");
		System.out.format("\n-----------------------------------------------------------");

//for loop and switch case to convert letter grades to points and assign default for invalid inputs
		for (int i=0;i<3;i++) {
			switch (letterGrade.get(i)) {
			case ("A"):
			case ("a"):
				points.add(4.00);
				break;
			case ("B"):
			case ("b"):
				points.add(3.00);
				break;
			case ("C"):
			case ("c"):
				points.add(2.00);
				break;
			case ("D"):
			case ("d"):
				points.add(1.00);
				break;
			case ("F"):
			case ("f"):
				points.add(0.00);
				break;
			default:
				System.out.println("\nThe letter grade you have entered is invalid please try again!");
				points.add(0.0);
	            letterGrade.add("");
	            gpa=0.00;
				break;
			}
//section to print all points information and gpa 
		System.out.format("\n%-6.6s                        %1.1s                       %.2f ", 
	    className.get(i).toUpperCase(), letterGrade.get(i).toUpperCase(),(double)points.get(i));
		gpa+= (points.get(i));
		}
		
		System.out.format("\n-----------------------------------------------------------");
		
		System.out.format("\n                                                GPA: %.2f", (gpa/3));
		
//if statement to determine whether the student made the Dean's List
		if ((gpa/3)>=3.50) {
			System.out.println("\nCongratulations you made the Dean's List!");
		}
		
//section to clear previous students information and keep each report card array list new
		className.clear();
	    letterGrade.clear();
	    points.clear();

//restarts new student
	    System.out.print("\n\nEnter student's name: ");
		studentName=input.nextLine();

	}

//when user enters done to quit this statement appears to let them know the program has terminated
System.out.println("\n\nThank you for using the Report Card Program! Have a Nice Day!");

//this line closes the scanner 
	input.close();
	}
	
}

