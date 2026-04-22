import java.io.*;
class Third{
  public static void main(String[] args) throws FileNotFoundException{
  
    try{
      FileReader fr = new FileReader("First.java");
      }
    catch (FileNotFoundException e){
        System.out.println("Invalid File");
      }
      
      int[] arr = new int[]{0,5};
      
      try{
        System.out.println(arr[2]);
      }
      catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Array Length is :" + arr.length);
      }
      
      try{
        int result = 5/0;
      }
      catch(ArithmeticException e){
        System.out.println("Cannot Divide by 0");
      }
      System.out.println("End of public static void main()");
  }
}
