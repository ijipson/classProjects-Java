//Izabel Jipson
//Zoo Program
//This programs uses a HashMap to create a place where all the animals' info will be stored
//May 22, 2023

//imports HashMap library
import java.util.HashMap;
public class Zoo{
	
//initializes HashMap called animalStore
	HashMap<String, Animal> animalStore=new HashMap<String, Animal>();
	
//this method allows programmers to add animals to the zoo if they are created alive
	public boolean addAnimalToZoo(Animal newAnimal) {
		if (newAnimal.isAlive()) {
		animalStore.put(newAnimal.getIDTag(), newAnimal);
		newAnimal.setHabitat("Zoo");
		System.out.println("** Animal Successfully Added To Zoo **\n ____________________________________\n");
		return true;
		}
		else {
			System.out.println("** Animal is dead, cannot be added to zoo. **\n _______________________________________\n");
			return false;
		}
	}
	
//this method allow programmers to remove animals and their info from the zoo 
	public boolean removeAnimalFromZoo(String IDTag) {
		if (animalStore.containsKey(IDTag)){
			animalStore.remove(IDTag);
			System.out.println("** Animal:"+IDTag+" has successfully been removed from zoo. **");
			return true;
		}
		else {
		System.out.println("The animal you tried to remove: "+IDTag+" is not in this zoo.");
		return false;
		}
		}
	
//this method allows programmers to print all the animals currently in the zoo and their info
public void printAllAnimals() {
	System.out.println("Animals In The Zoo!\n-------------------");
	Animal temp;
	for(Object key: animalStore.keySet()) {
		temp=(Animal)animalStore.get(key);
		System.out.println(temp.toString());
	}
	
}
	}


