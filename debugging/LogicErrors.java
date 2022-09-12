// Another error exists where the code runs perfectly fine, and does what it was made to do, but doesn't have the correct output.
// This is an error ont he programmers side, it is a DESIGN FLAW. 
// There is an error in this program. The programmers do not want there to be a "Step#0", and yet there is. Why?
public class LogicErrors {

  public static void main(String[] args) {
    
    int steps = 10;
    
    for (int i = 1; i <= steps; i++) {
      
      System.out.println("Step #" + i);
      
    }
    
  }
  
}