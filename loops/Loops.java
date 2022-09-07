import java.util.ArrayList;

public class Loops {
    public static void main(String[] args) {
        int exampleOne = 5;
        System.out.println("Example One showing \"while\" loops, and incrementing, (or, in this case, decrementing)");
        while (exampleOne >= 0) {
            System.out.println(exampleOne);
            exampleOne--;
        }

        System.out.println("\nExample Two showing \"for\" loops. In particular, with the use of arrays.");
        ArrayList<String> groceries = new ArrayList<String>();
        groceries.add("bananas");
        groceries.add("apples");
        groceries.add("strawberries");
        for (int exampleTwo = 0; exampleTwo < groceries.size(); exampleTwo++)  {
            System.out.println(groceries.get(exampleTwo));
        }

        System.out.println("\nExample Three showing how a \"for\" loop can stop iterating or skipping an iteration altogether.");
        /*
            !!! AP EXAM NOTE !!!
        Loops can exist all throughout code, including methods.
        If a "return" statement is executed inside a loop contained in a method, then that iteration of the loop would stop and the method/constructor will be exited. 
        */
        for (int i = 0; i < 100; i++) {
            if (i == 55) {
                break;
            } else if (i % 5 != 0) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("\nExample Four showing how a \"for-each\" loop can be used to run through EVERY index of an array, in order to do something with that data, as shown with the earlier groceries example.");
        // We can name the first part of the parameter anything we want, it's essentially the counter for going through every index in the array.
        for (String groceryItem : groceries) {
            System.out.println(groceryItem);
        }

        System.out.println("\nExample Five shows removing elements while traversing an array. We removed apples from the list with a loop.");
        // Avoid manipulating size of Arraylists when using na enhanced for loop. Adding or removing elements form an Arraylist when using a for-each loop will result in an error.
        for (int i = 0; i < groceries.size(); i++) {
            if (groceries.get(i) == "apples") {
                groceries.remove(i);
            }
        }
        System.out.println(groceries);
    }
}