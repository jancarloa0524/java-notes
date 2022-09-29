/* Lesson 3 Coding Activity Question 1 */
// Takes a word, and gives back the first and last characters of a string given by a number. So dictionary, 1, reutrns "dy".
import java.util.Scanner;

public class CodingActivityOne
{
  public static void main(String[] args)
  {
  
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    String inputString;
    int inputNum;
    
    System.out.println("Enter a string:");
    inputString = scan.nextLine();
    System.out.println("Enter a number:");
    inputNum = scan.nextInt();
    System.out.println(inputString.substring(0, inputNum) + inputString.substring((inputString.length() - inputNum)));
  }
}