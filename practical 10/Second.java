//Demonstrating Multilevel Inheritance
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

class Student extends Human{

  String name;
  
  Student(float height, float weight, int numberOfLegs, String name, String species){
    super(height,weight,numberOfLegs,species);
    this.name = name;
  }
  
  void printStudentInfo(){
    System.out.println("Name : "+ name);
  }
  
  public static void main(String[] args){
    
    Student ghananil = new Student(6.0f, 82.00f, 2, "Ghananil", "Mammal");
    System.out.println("----:Student Info:----");
    ghananil.printStudentInfo();
    ghananil.printHumanInfo();
    ghananil.printAnimalInfo();
  }
}
