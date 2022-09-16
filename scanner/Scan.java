// "Scanner" is a Java Utlity
import java.util.Scanner;

class Scan {
    public static void main(String[] args) {
        // You need to establish a Scanner like you do a variable, the Scanner method looks at System input, hence System.in
        Scanner scan = new Scanner(System.in);
        String n;
    
        System.out.println("What is your name?");
        // This calls the terminal to read user input into the terminal.
        n = scan.nextLine();
        System.out.println("Hello " + n + ". Nice to meet you");

    }
}