//Demonstrating Hierarchical Inheritance
class Animal{

  String species;
  int numberOfLegs;
  
  Animal(String species, int numberOfLegs){
    this.species = species;
    this.numberOfLegs = numberOfLegs;
  }
  
  void printAnimalInfo(){
    System.out.println("Species : " + species);
    System.out.println("Number Of Legs : " + numberOfLegs);
  }
}

class Human extends Animal{
  
  float weight;
  float height;
  
  Human(float height, float weight, int numberOfLegs, String species){
    super(species, numberOfLegs);
    this.weight = weight;
    this.height = height;
  }
  
  void printHumanInfo(){
    System.out.println("Height in feets : "+ height);
    System.out.println("Weight in kgs : "+ weight);
  }
}

class Dog extends Animal{
  
  float weight;
  float height;
  
  Dog(float height, float weight, int numberOfLegs, String species){
    super(species, numberOfLegs);
    this.weight = weight;
    this.height = height;
  }
  
  void printDogInfo(){
    System.out.println("Height in feets : "+ height);
    System.out.println("Weight in kgs : "+ weight);
  }
}

class Main{
  
  public static void main(String[] args){
    
    //Creating Human Object
    Human man = new Human(5.5f, 60.00f, 2, "Mammal");
    Dog vodafone = new Dog(1.5f, 15.00f, 4, "Mammal");
    
    System.out.println("----:Man Info:----");
    man.printAnimalInfo();
    man.printHumanInfo();
    
    System.out.println("----:Vodafone Info:----");
    vodafone.printDogInfo();
    vodafone.printAnimalInfo();
  }
}
