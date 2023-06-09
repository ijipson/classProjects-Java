//Izabel Jipson
//Bird Program
//This is a subclass with properties specific to Birds
//May 22, 2023

//these properties are private and Bird specific
public class Bird extends Animal{
private String type;
private boolean flys, swims;


//constructors to allow programmers to set their own values for Birds
Bird(String newIDTag, String newColor, String newHabitat, String newType, boolean newFlys, boolean newSwims) {
	super(newIDTag,newColor,newHabitat);	
	giveLife();
	type=newType;
	flys=newFlys;
	swims=newSwims;
}
Bird(String newType, boolean newFlys, boolean newSwims){
	type=newType;
	flys=newFlys;
	swims=newSwims;
}

//getters and setters to modify values but not methods since they are private
public String getType() {
	return type;
}
public void setType(String newType) {
	type=newType;
}

public boolean getFlys() {
	return flys;
}
public void setFlys(boolean newFlys) {
	flys=newFlys;
}

public boolean getSwims() {
	return swims;
}
public void setSwims(boolean newSwims) {
	swims=newSwims;
}

//similar to toString method but includes specific Bird properties as well
public String printBird() {
	return "Type is: " +type+ "\nFlys? "+flys+"\nSwims? "+swims+ "\n"+toString();
}
}
