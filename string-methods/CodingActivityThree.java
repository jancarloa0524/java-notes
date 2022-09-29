/* 
Lesson 3 Coding Activity Question 3 
Write a program that takes two words from the user.
Both words should be converted into lowercase.
Compare the two words in alphabetical order with the first letters of the two words, so a positive number should pop up if the first word is alphabetically higher than the second word, a negative number should pop up if it is the opposite, and zero should pop up if the first word and the second word share the same first letter.
Hint #1 : while these instructions don't specify a specific number to print, there is a String method which, if used correctly, will produce a number which matches these conditions in all possible cases.
Hint #2: There is a simple string method you can use to alphabetically and numerically compare the two input strings, but you gotta first obtain the first letter of the two inputs( the substring method is one way to go about it).
*/

import java.util.Scanner;

public class CodingActivityThree
{
  public static void main(String[] args)
  {
  
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    String wordOne;
    String wordTwo;
    
    System.out.println("Enter first word:");
    wordOne = scan.nextLine();
    System.out.println("Enter second word:");
    wordTwo = scan.nextLine();
    
    wordOne = wordOne.toLowerCase();
    wordTwo = wordTwo.toLowerCase();
    wordOne = wordOne.substring(0, 1);
    wordTwo = wordTwo.substring(0, 1);
    System.out.println("Result: " + wordOne.compareTo(wordTwo));
  }
}