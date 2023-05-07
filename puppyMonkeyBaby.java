//Izabel Jipson
//Puppy Monkey Baby
//February 15, 2023
public class puppyMonkeyBaby {

	public static void main(String[] args) {
	String thing1 = "puppy";	String thing2 = "Monkey";	  String thing3 = "baby";

				if (thing1.compareTo(thing2) <= 0 && thing1.compareTo(thing3) <= 0) {
					if (thing2.compareTo(thing3) <= 0)
						System.out.println(thing1 + " " + thing2 + " " + thing3);
					else 
						System.out.println(thing1 + " " + thing3 + " " + thing2);
				}
				else if (thing2.compareTo(thing3) <= 0 && thing2.compareTo(thing1) <= 0) {
					if (thing1.compareTo(thing3) <= 0) 
						System.out.println(thing2 + " " + thing1 + " " + thing3);
					else
						System.out.println(thing2 + " " + thing3 + " " + thing1);
				}
				else {
					if (thing1.compareTo(thing2) <= 0) 
						System.out.println(thing3 + " " + thing1 + " " + thing2);
					else
						System.out.println(thing3 + " " + thing2 + " " + thing1);
				}


	}

}
