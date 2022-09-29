/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;

public class CodingActivityTwo
{
  public static void main(String[] args)
  {
  
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    String inputString;
    int inputNum;
    
    System.out.println("Enter a string:");
    inputString = scan.nextLine();
    System.out.println("How many characters would you like to delete at the end?");
    inputNum = scan.nextInt();
    System.out.println(inputString.substring(0, inputString.length() - inputNum));
  }
}