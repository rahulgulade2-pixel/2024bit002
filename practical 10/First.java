//Demonstrating Single Inheritance
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
  
  public static void main(String[] args){
    
    Human man = new Human(50.5f,6.1f,2,"Mammal");
    man.printHumanInfo();
    man.printAnimalInfo();
  }
}
