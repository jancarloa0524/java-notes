/* 
Lesson 3 Coding Activity Question 4 
Write code which takes a sentence as an input from the user and then prints the length of the first word in that sentence.
*/

import java.util.Scanner;

public class CodingActivityFour
{
  public static void main(String[] args)
  {
  
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    String userInput;
    
    System.out.println("Enter a sentence:");
    userInput = scan.nextLine();
    System.out.println(userInput.indexOf(" "));
  }
}