//Izabel Jipson
//Animal Program
//This program is a superclass to establish IDTags, Color, Habitat, and life status for all animals in the zoo
//May 22,2023

//import random library
import java.util.Random;

//properties of Animal superclass
public class Animal {
	private String IDTag,color,habitat;
	private boolean respiration;
Random rand = new Random();

//constructor that sets default values for Animals with no set values
Animal() {
	IDTag="Dog";
	color="White";
	habitat="Domestic Home";
	giveLife();
}

//constructor to allow programmers to set values for different Animals
Animal(String newIDTag, String newColor, String newHabitat) {
	IDTag=newIDTag;
	color=newColor;
	habitat=newHabitat;
	giveLife();
}

//getter and setter for IDTag since it's a private method
public String getIDTag() {
	return IDTag;
}
public void setIDTag(String newIDTag) {
	IDTag=newIDTag;
}

//getter and setter for color since it's a private method
public String getColor() {
	return color;
}

public void setColor(String newColor) {
	color=newColor;
}

//getter and setter for habitat since it's a private method
public String getHabitat() {
	return habitat;
}

public void setHabitat(String newHabitat) {
	habitat=newHabitat;
}

//getter and setter for respiration since it's a private method
public boolean isAlive() {
	return respiration;
}
public void dies() {
	respiration=false;
	}

//this method randomly chooses whether an animal is alive when it is created for the Zoo
public void giveLife() {
	int life=rand.nextInt(1,4);
	if (life==3) {
		respiration=false;
	}
	else {
		respiration=true;
	}

}

//Returns all values of the Animal 
public String toString() {
	return "IDTag: "+IDTag+ "\nColor: "+color+"\nHabitat: "+habitat+"\nAlive? "+respiration+"\n";
}

}
