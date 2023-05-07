//Izabel Jipson
//Roman Numerals Calculator
//This program adds Roman numerals together
//February 16, 2023

import java.util.Scanner;
public class roman_Numerals {

	public static void main(String[] args) {
		
//opens scanner
		Scanner input=new Scanner(System.in);
	
//gets input from user in Roman numeral form
		System.out.print("Enter a Roman Numeral between 1 and 5 ");
		String num1=input.nextLine();
		num1=num1.toUpperCase();
		System.out.print("\nEnter another Roman Numeral between 1 and 5 ");
		String num2= input.nextLine(); 
		num2=num2.toUpperCase();
		
//converts first numerical input to integers
		int number1 = 0;
		if (num1.equals("I"))
			number1=1;
		else if (num1.equals("II"))
			number1=2;
		else if (num1.equals("III"))
			number1=3;
		else if (num1.equals("IV"))
			number1=4;
		else if (num1.equals("V"))
			number1=5;
		else 
		System.out.format("The number you entered %s is invalid please try again.",num1);

//converts second numerical input to integers
		int number2 = 0;
		if (num2.equals("I"))
			number2=1;
		else if (num2.equals("II"))
			number2=2;
		else if (num2.equals("III"))
			number2=3;
		else if (num2.equals("IV"))
			number2=4;
		else if (num2.equals("V"))
			number2=5;
		else 
		System.out.format("\nThe number you entered %s is invalid please try again.",num2);
		
//calculates total in integer form
		int total=number1+number2;
		
//converts answer back to Roman numerals
		String r = null;
		if (total==1)
			r="I";
		else if (total==2)
			r="II";
		else if (total==3)
			r="III";
		else if (total==4)
			r="IV";
		else if (total==5)
			r="V";
		else if (total==6)
			r="VI";
		else if (total==7)
			r="VII";
		else if (total==8)
			r="VIII";
		else if (total==9)
			r="IX";
		else if (total==10)
			r="X";
//		else 
//		System.out.format("\nThe number you entered %s is invalid please try again.",num2);

//prints original equation and answer in Roman numerals and only produces equations if inputs are valid
		if ((number1 & number2)!=0)
			System.out.format("\n%s + %s = %s", num1, num2, r);

//closes scanner
		input.close();  
	}

}
