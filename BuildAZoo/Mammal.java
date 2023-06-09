//Izabel Jipson
//Mammal Program
//This program is a subclass and sets properties specific to Mammals
//May 22, 2023


//properties of Mammal class 
public class Mammal extends Animal{
private String type;
private boolean swims, fur;

//constructor allows programmer to set values for Mammal properties
Mammal(String newIDTag, String newColor, String newHabitat, String newType, boolean newSwims, boolean newFur) {
	super(newIDTag,newColor,newHabitat);
	giveLife();
	type=newType;
	swims=newSwims;
	fur=newFur;
}

//second constructor with just mammal specific properties
 Mammal(String newType, boolean newSwims, boolean newFur){
	type=newType;
	swims=newSwims;
	fur=newFur;
}
 
//getters and setters for Type property since its private
public String getType() {
	return type;
}
public void setType(String newType) {
	type=newType;
}

//getters and setters for Swims property since its private
public boolean getSwims() {
	return swims;
}
public void setSwims(boolean newSwims) {
	swims=newSwims;
}

//getters and setters for Fur property since its private
public boolean getFur() {
	return fur;
}
public void setFur(boolean newFur) {
	fur=newFur;
}


//uses method similar to toString to return all properties of Mammal + Animal properties
public String printMammal() {
	return "Type is: " +type+ "\nSwims? "+swims+"\nFur? "+fur+ "\n"+toString();
}
}
