//Exploring static, init and constructor flow of execution
class Demo{
  static {
      System.out.println("In Demo: Static");
  }
  
  {
    System.out.println("In Demo: Init");
  }
  
  Demo(){
    System.out.println("In Demo: Constructor");
 }
 
 public static void main(String[] args){
  new Demo();
 }
}
