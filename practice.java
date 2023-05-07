import java.util.Scanner;
public class practice {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			//Your coffee starts at 195 degrees.  Assume anything above 130 degrees is too hot and that adding an ice chip lowers the temperature by 2 degrees.  
			//Tell me when it is safe to drink my coffee and how many ice chips were added to get to a safe temperature.
			// pseudocode
//Program 1
			int coffee=195,icechip = 2,cnt=0;
			
			while (coffee>130) {
				coffee= coffee-icechip;
				cnt++;
			}
			System.out.format("Your coffee is now safe to drink %d icechips have been added!",cnt);
//Program 2
//Use a do-while loop to read in numbers from the user (one at a time) and find the product of these numbers (multiply) until the user enters a zero.  
			//Print the final product.
			
					int n=1,i;
					System.out.println("\nInput an integer"); 
					i = input.nextInt();
					
					do {
					    n=n*i;
					    System.out.println("Input an integer");
					    i = input.nextInt();

					} while (i != 0);
		System.out.format("Your final product is %d",n);
			}
		

		
		
	}	
	
	}


