// RUNNER FILE REQUIRED
/*
INSTRUCTIONS:
Write a public static method named highestNum which takes an ArrayList of Integer objects, and returns the highest value in this list. Write your highestNum method in the U7_L2_Activity_Two class. Use the runner class to test your method but do not add a main method to the U7_L2_Activity_Two.java file or your code will not be scored correctly.
*/
import java.util.ArrayList;

public class U7_L2_Activity_Two
{

  // write your average method here
  public static Integer highestNum(ArrayList<Integer> list) {
    Integer num = new Integer(Integer.MIN_VALUE); // Set to smallest number possible
    for(int i = list.size() - 1; i >= 0; i--) {
      // if num is less than the given number, set num equal to that number. This is the highest number in the list up to that point. 
      if (num < list.get(i)) {
        num = list.get(i);
      }
    }
    return num;
  }
}
