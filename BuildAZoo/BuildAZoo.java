//Izabel Jipson
//Build A Zoo Program
//This program uses all of the methods from Zoo,  Animal and its subclasses to build a zoo 
//May 22, 2023 
public class BuildAZoo {

    public static void main(String[] args) {
    	
   //initialize Zoo
    	 Zoo izZoo=new Zoo();
    	
    	 System.out.println("Welcome to Izabel's Zoo!\n");
    	 
    //Creates 4 Birds, sets and prints the values, and adds it to the zoo
        Bird sparrow=new Bird("spa23","Brown","Woods","Sparrow", true, false);
        System.out.println(sparrow.printBird()+"\n");
        izZoo.addAnimalToZoo(sparrow);
        
        Bird cardinal=new Bird("car23","Red","Woods","Cardinal", true, false);
        System.out.println(cardinal.printBird()+"\n");
        izZoo.addAnimalToZoo(cardinal);
        
        Bird dove=new Bird("dov23","White","Woods","Dove", true, true);
        System.out.println(dove.printBird()+"\n");
        izZoo.addAnimalToZoo(dove);
        
        Bird crow=new Bird("cro23","Black","Woods","Crow", true, false);
        System.out.println(crow.printBird()+"\n");
        izZoo.addAnimalToZoo(crow);
        
    //Creates 6 Mammals, sets and prints the values, and adds it to the zoo
        Mammal bear=new Mammal("bea23","Brown","Forest","Bear",true, true);
        System.out.println(bear.printMammal()+"\n");
        izZoo.addAnimalToZoo(bear);
        
        Mammal whale=new Mammal("wha23","Grey","Ocean","Whale",true, false);
        System.out.println(whale.printMammal()+"\n");
        izZoo.addAnimalToZoo(whale);
        
        Mammal chimpanzee=new Mammal("chi23","Black","Jungle","Chimpanzee",true, true);
        System.out.println(chimpanzee.printMammal()+"\n");
        izZoo.addAnimalToZoo(chimpanzee);
        
        Mammal cheetah= new Mammal("che23","Yellow","Grassy Deserts","Cheetah",false, true);
        System.out.println(cheetah.printMammal()+"\n");
        izZoo.addAnimalToZoo(cheetah);
        
        Mammal dolphin=new Mammal("dol23","Grey","Ocean","Dolphin",true, false);
        System.out.println(dolphin.printMammal()+"\n");
        izZoo.addAnimalToZoo(dolphin);
        
        Mammal elephant=new Mammal("ele23","Grey","Grasslands","Elephant",true, false);
        System.out.println(elephant.printMammal()+"\n");
        izZoo.addAnimalToZoo(elephant);
        
    //Creates 2 Reptiles, sets and prints the values, and adds it to the zoo
        Reptile crocodile= new Reptile("cro23","Green","Swamp","Crocodile",true, true);
        System.out.println(crocodile.printReptile()+"\n");
        izZoo.addAnimalToZoo(crocodile);
        
        Reptile snake= new Reptile("sna23","Black","Forest","Snake",true, false);
        System.out.println(snake.printReptile()+"\n");
        izZoo.addAnimalToZoo(snake);
    
      //uses method to print all the animals that are eligible to be in the zoo
         izZoo.printAllAnimals();
         
      //uses .dies(); method to kill whale 
         whale.dies();
      
      //reprints all the animals in the zoo
         izZoo.printAllAnimals();
         
      //removes whale from the zoo and gives the reason for removal
         izZoo.removeAnimalFromZoo(whale.getIDTag());
         System.out.println("Reason: Death\n");
         
      //removes snake from the zoo and gives reason for removal
         izZoo.removeAnimalFromZoo(snake.getIDTag());
         System.out.println("Reason: Transfer\n");
         
      //final reprint of all animals left in the zoo
         izZoo.printAllAnimals();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    }