//Izabel Jipson
//Test Animals Program
//This program is a test to see if all the methods work
//May 22, 2023
public class TestAnimals {

	public static void main(String[] args) {
		
		//From Animal superclass
		Animal frog=new Animal("ribbit23", "green", "swamp");
		System.out.println(frog.toString()+"\n");
	
		//From Bird subclass
		Bird sparrow= new Bird("sparrow23","brown","woods","Bird",true,false);
		System.out.println(sparrow.printBird()+"\n");
	
		//From Mammal subclass
		Mammal cheetah= new Mammal("wildforestgump2","yellow","grassy deserts","Mammal",false, true);
		System.out.println(cheetah.printMammal()+"\n");
		
		//From Reptile subclass
		Reptile crocodile= new Reptile("nightswimmer","green","swamps","Crocodile",true, true);
		System.out.println(crocodile.printReptile()+"\n");

	}

}
