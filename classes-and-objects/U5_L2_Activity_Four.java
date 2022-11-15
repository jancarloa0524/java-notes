/* Lesson 2 Coding Activity Question 4 */

import java.util.Scanner;

public class U5_L2_Activity_Four
{

  /* Add the method coinConverter here */
  public static void coinConverter(int n) {
    System.out.println("Dollar Bills:" + (n - (n % 100)) / 100);
    System.out.println("Quarters: " + (n % 100) / 25);
    System.out.println("Dimes: " + ((n % 100) % 25) / 10);
    System.out.println("Nickels: " + (((n % 100) % 25) % 10) / 5);
    System.out.println("Pennies: " + (((n % 100) % 25) % 10) % 5);
    System.out.println();
  }
  // The reason why this works is because if a n < m, n % m = n. Otherwise, n % m = change! So, for dimes, ((1234 % 100) % 25) = 9, and 9 / 10 would equal 0 as an int. When we move on (((1234 % 100) % 25) % 10) = 9 as well, because 9 % 10 = 9. So from there, 9 / 5 gives us an int of 1! 
  
  // You can uncomment and add to the main method to test your code
  // You will need to remove/comment out this method before checking your code for a score
  public static void main(String[] args){
    coinConverter(1234);
    coinConverter(234);
    coinConverter(25763);
  }
}