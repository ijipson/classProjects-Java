//Izabel Jipson
//Rock Paper Scissors Program
//This program allows users to play rock paper scissors against a computer (bonus challenge was to run the rock, paper, scissors model from Big Bang Theory)
//March 16, 2023

//imports scanner and random libraries
import java.util.Scanner;
import java.util.Random;
public class rps {

	public static void main(String[] args) {

//initializes variables
		Scanner input = new Scanner(System.in);
		Random play= new Random();
		String choice = null, cplay=null;
		int i, c = 0,win=0,lose = 0; 

//Displays playing options and rules
		System.out.println("How to play: Enter one of the options below and the computer will play back until someone wins 3 times. Enjoy!"); 
		System.out.println("\n\nPlease pick an option! \n(1) Rock \n(2) Paper \n(3) Scissors \n(4) Lizard \n(5) Spock \n(0) Quit\n"); 
		i = input.nextInt();

//while loop to run game logic and have computer play back
		while (i!=0 && !(lose==3||win==3)) {
			if (i<=5) {
			 c= play.nextInt((5-1)+1)+1;
			
//switch case to translate user's numbers to either rock papers or scissors 
			 switch (i) {
			 case 1:
				 choice=("Rock");
			     break;
			 
			 case 2:
				 choice=("Paper");
			     break;
			 
			 case 3:
				 choice=("Scissors");
			     break;
			     
			 case 4:
				 choice=("Lizard");
			     break;
			     
			 case 5:
				 choice=("Spock");
			     break;
			     
			 case 0:
				 System.out.println("Thank You for Playing Have a Nice Day!");
				 break;
				 
			 default:
				 System.out.println("The choice you made is invalid please try again!");
				 break;
			 }
			 
//switch case that translates computer's numbers to either rock, paper, or scissors 
			 switch (c) {
			 case 1:
				 cplay=("Rock");
			     break;
			 
			 case 2:
				 cplay=("Paper");
			     break;
			 
			 case 3:
				 cplay=("Scissors");
			     break;
			     
			 case 4:
				 cplay=("Lizard");
			     break;
			     
			 case 5:
				 cplay=("Spock");
			     break;	 
			 }
			 
//outputs outcome of both plays
			 System.out.format("\nYou chose %s, the computer chose %s", choice, cplay);
			
			 
//game logic: uses if statement for all tie possibilities for user			 
			 if (choice.equals(cplay)){
			     System.out.println("\nIt's a tie!");
				}
			 
//game logic: uses if statement for all win possibilities for user					 
			 else if (choice.equals("Scissors")&& cplay.equals("Paper")||
					   choice.equals("Paper")&& cplay.equals("Rock")||
					   choice.equals("Rock")&& cplay.equals("Lizard")||
					   choice.equals("Lizard")&& cplay.equals("Spock")||
					   choice.equals("Spock")&& cplay.equals("Scissors")||
					   choice.equals("Rock")&& cplay.equals("Scissors")||
					   choice.equals("Lizard")&& cplay.equals("Paper")||
			           choice.equals("Scissors")&& cplay.equals("Lizard")||
			           choice.equals("Paper")&& cplay.equals("Spock")||
					   choice.equals("Spock")&& cplay.equals("Rock")){
				 System.out.println("\nYou Win!");
//for every user win it adds one to count so that games ends after 3 wins
				 win=win+1;
			 }
			 
//game logic: uses if statement for all lose possibilities for user					 
			 else if (cplay.equals("Scissors")&& choice.equals("Paper")||
					  cplay.equals("Paper")&& choice.equals("Rock")||
					  cplay.equals("Rock")&& choice.equals("Lizard")||
					  cplay.equals("Lizard")&& choice.equals("Spock")||
					  cplay.equals("Spock")&& choice.equals("Scissors")||
					  cplay.equals("Rock")&& choice.equals("Scissors")||
					  cplay.equals("Lizard")&& choice.equals("Paper")||
			          cplay.equals("Scissors")&& choice.equals("Lizard")||
			          cplay.equals("Paper")&& choice.equals("Spock")||
					  cplay.equals("Spock")&& choice.equals("Rock")){
				 System.out.println("\nYou Lose!");
				 
//for every user loss it adds one to count so that games ends after 3 losses
				 lose=lose+1;
			 }
			}
			
//if invalid input is entered prints below statement and asks for a new input
			else {
				System.out.println("The choice you made is invalid please try again!");
			}
//uses if statement to end game after either 3 user wins or 3 user losses
			 if (!(lose==3 || win==3)) {
			 System.out.println("\nPlease pick an option! \n(1) Rock \n(2) Paper \n(3) Scissors \n(4) Lizard \n(5) Spock \n(0) Quit"); 
			 i = input.nextInt();
			 }
			 else if(lose==3) {
				 System.out.println("\nYou lost 3 times :(");
			 }
			 else if(win==3) {
				 System.out.println("\nYou won 3 times :)");
			 }
			
		}

//once while loop ends or user quits this line prints statement and terminates program
		System.out.println("\nThank You For Playing Have a Good Day!");
		input.close();  

	}
	
}
