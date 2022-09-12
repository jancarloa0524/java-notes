// Excpetion Handling allows us to figure out what the specific issue of the program may be. 
public class ExceptionHandling {

  public static void main(String[] args) {
    // "try" allows you to define a block of code to be tested for errors while it is being executed
    try {
      int width = 0;
      int length = 40;
      
      int ratio = length / width;
    } catch (ArithmeticException e) {
        // Although we capture an Arithmetic Exception here, we could also capture many more in just one block of code. This would require another "catch"
      System.err.println("ArithmeticException: "+ e.getMessage());
    }
    // "catch" allows you to define a block of code to be executed if an error occurs in the try block.
        
  }
  
}