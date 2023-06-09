//Izabel Jipson
//Reptile Program
//This program is a subclass that has properties specific to reptiles
//May 22, 2023

//properties specific to reptiles
public class Reptile extends Animal{
private String type;
private boolean swims,walks;


//constructor to allow programmers to set their own values for reptiles
Reptile(String newIDTag, String newColor, String newHabitat, String newType, boolean newSwims, boolean newWalks) {
	super(newIDTag,newColor,newHabitat);
	giveLife();
	type=newType;
	swims=newSwims;
	walks=newWalks;
}

//constructor with values specific to reptiles 
Reptile(String newType, boolean newSwims, boolean newWalks){
	type=newType;
	swims=newSwims;
	walks=newWalks;
}

//getters and setters for Type since its a private property
public String getType() {
	return type;
}
public void setType(String newType) {
	type=newType;
}

//getters and setters for Swims since its a private property
public boolean getSwims() {
	return swims;
}
public void setSwims(boolean newSwims) {
	swims=newSwims;
}

//getters and setters for Walks since its a private property
public boolean getWalks() {
	return walks;
}
public void setWalks(boolean newWalks) {
	walks=newWalks;
}


//uses method similar to toString to return all properties of Reptile + Animal properties
public String printReptile() {
	return "Type is: " +type+ "\nSwims? "+swims+"\nWalks? "+walks+"\n"+toString();
}
}

