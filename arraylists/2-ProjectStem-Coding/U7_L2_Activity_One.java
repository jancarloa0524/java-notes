/*
INSTRUCTIONS:
Write a Java program that allows a user to input multiple words. Your program should stop accepting words when the user enters "STOP". Store the words in an ArrayList. The word STOP should not be stored in the list.

Next, print the ArrayList, then print all the strings from this list in the reverse order to which they appear in the list, with each one on a new line, while adding the strings from the array in sequential order starting from the beginning.
Sample run:
________________________________________________
Please enter words, enter STOP to stop the loop.
winter
fall
spring
summer
STOP

[winter,fall,spring,summer]
summerwinter
springfall
fallspring
wintersummer      
*/
import java.util.Scanner;
import java.util.ArrayList;

public class U7_L2_Activity_One
{

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> words = new ArrayList<String>();
    String userInput = "";
    
    System.out.println("Please enter words, enter STOP to stop the loop.");
    while (!userInput.equals("STOP")) {
      userInput = scan.nextLine();
      if(!userInput.equals("STOP")) words.add(userInput);
    }
    
    System.out.println(words);
    for(int i = words.size() - 1; i >= 0; i--){
      System.out.println(words.get(i) + words.get(words.size() - 1 - i));
      // Reverse through the list; Start at the end, and add the word at the beginning, which is equal to the index of the last element in the list, minus the current index selected. So, at say, the 2nd to final index of an array of 4 items (this index would be 2), then get the 2nd index word + the word at the index (4 - 1 - 2, = 1). 
    }
  }
}
