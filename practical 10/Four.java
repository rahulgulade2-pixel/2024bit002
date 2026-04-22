//Demonstrating Method Overloading
class OverloadMethods{
  
  static void demo(int num){
    System.out.println("This is the demo method that takes 1 argument");
    System.out.println("The passed argument is : " + num);
  }
  
  static void demo(int num, String dept){
    System.out.println("This is the demo method that takes 2 argument");
    System.out.println("The passed argument are : " + num + " and  " + dept);
  }
  
  public static void main(String[] args){
    
    System.out.println("----:Overloading Method Named : demo():----");
    //calling method with 1 argument
    demo(5);
    //calling method with 2 arguments
    demo(6,"It Dept.");
  }
}
