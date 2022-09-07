// We must important utilities in order to have more methods, in this case we import methods to work with arrays.
import java.util.Arrays;

public class Classroom {
  
  // You can pass arguments when you run a .java file. When you run this file, you can pass in a students name to add a new student, like so: java Classroom John
  public static void main(String[] args){
    // This is called creating an array "explicitely"
    String[] students = {"Sade", "Alexus", "Sam", "Koma"};
    /*
        !!! AP EXAM NOTE !!!
    When we create an empty array, the data isn't necessarily empty, it just has data in it's place
    Data Type	Initialized Value
    int	                0
    double	           0.0
    boolean	          false
    Reference	      null
    */
    double[] mathScores = new double[4];
    // You can set up the values of each index in this empty array later on. 
    
    // You can grab specific elements by it's index. The first index is always the 0th one.
    mathScores[0] = 94.5;
    mathScores[2] = 76.8;

    // These lines wouldn't have been possible without importing Array methods
    System.out.println("The number of students in the class is " + mathScores.length);
    System.out.println("The students are: " + Arrays.toString(students));

    // Calling back to earlier, here we are setting the argument that was passed in, equal to the new student, which must be a string due the datatype being a string array as declared in the main() method.
    String newStudent = args[0];
    System.out.println("The new student is: " + newStudent);
  }
}
