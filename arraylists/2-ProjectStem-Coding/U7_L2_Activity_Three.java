import java.util.ArrayList;

public class U7_L2_Activity_Three
{

  public static ArrayList<Integer> getEvens(ArrayList<Integer> vals)
  {
      // Implement this method as described in the assignment
      ArrayList<Integer> finalList = new ArrayList<Integer>();
      for (Integer num: vals) {
        if (num % 2 == 0) {
          finalList.add(num);
        }
      }
      return finalList;
  }

}
