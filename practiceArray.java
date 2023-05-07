//Izabel Jipson
//Fun with Arrays
//Basic Array functions with bands as data
//March 27, 2023

import java.util.Arrays;
public class practiceArray {

public static void main(String[] args) {

//list of bands I listen to
     String[] bands = {"TV Girl", "Her's", "Yot Club", "Wallows", "Vacations"};

//uses for each loop to print the overall band array 
     System.out.println("My Favorite Bands");
		for (String band : bands) {
		    System.out.println(band);
		        }
 
//uses a for loop to print them in alphabetical order
	 Arrays.sort(bands);
     System.out.println("\nSorted Favorite Bands");
		 for (int i = 0; i < bands.length; i++) {
		     System.out.println(bands[i]);
		        }

//uses toString to print them side by side and still in alphabetical order
		 System.out.println("\ntoString Favorite Bands");
		 System.out.println(Arrays.toString(bands));
		    }
		
	}

