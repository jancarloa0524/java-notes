import java.util.Scanner;
// Goes through lesson 1, 2, and 4 of ProjectSTEM
public class Methods {
    private String str;

    public Methods(String str) {
        this.str = str;
    }

    public static String sayString() {
        return str;
    }

    public static void saySomething(String str) {
        System.out.println("\n" + str);
    }

    public static void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;

        System.out.println("Please enter anything!");
        input = scan.nextLine();
        saySomething(input);
        sayHelloWorld();
        // We do not need a reference to this method. However, for example, 
        Methods method1 = new Methods("Hi!");
        System.out.println(method1.sayString());

    }
}