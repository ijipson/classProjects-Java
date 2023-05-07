//Izabel Jipson
//Arrays Rainbow Exercise
//various arraylist functions
//March 30, 2023
import java.util.ArrayList;
public class rainbow {


	public static void main(String[] args) {
//Setup an ArrayList that holds Strings.
		
		ArrayList<String> strList = new ArrayList<String> ( );

//Put in the 7 colors of the rainbow - ROY G BIV
		strList.add("Red");
		strList.add("Orange");
		strList.add("Yellow");
		strList.add("Green");
		strList.add("Blue");
		strList.add("Purple");
		
//Remove your least favorite color
		strList.remove("Orange");
		
//Add pink to the end
		strList.add("Pink");
		
//Add black to the beginning
		strList.add(0,"Black");
		
//Print what’s left
		System.out.println(strList);
		
		
	}

}
