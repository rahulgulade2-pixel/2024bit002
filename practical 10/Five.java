//Demonstrating method overriding
class Animal{
  
  void eat(){
    System.out.println("Animal Ate");
  }
}

class Human extends Animal{

  void eat(){
    super.eat();
    System.out.println("Human Ate");
  }
  
  public static void main(String[] args){
    
    Human man = new Human();
    man.eat();
  }
}
