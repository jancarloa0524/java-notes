// Unlike a SyntaxError.java, this program can be compiled. However, when it runs, there is now a Run-time Error
// A run-time error is basically just when a program asks a computer to do something it can't really do, and thus, cannot run the program. 
// Examples: dividing by zero, using a file that doesn't exist
// The runtime error here, is one of the examples. 

// When we read the error, we will also find an "Exception". These are conditions that occur at runtime and may cause the termination of a program.
/*
Examples Include:
ArithmeticException: Something went wrong during an arithmetic operation; for example, division by zero.
NullPointerException: You tried to access an instance variable or invoke a method on an object that is currently null.
ArrayIndexOutOfBoundsException: The index you are using is either negative or greater than the last index of the array (i.e., array.length-1).
FileNotFoundException: Java didn’t find the file it was looking for.
*/
public class RuntimeErrorsAndExceptions {

  public static void main(String[] args) {
    
    int width = 0;
    int length = 40;
    
    int ratio = length / width;
    
    System.out.println(ratio);
    
  }
  
}