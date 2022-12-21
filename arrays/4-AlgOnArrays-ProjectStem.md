# Algorithms on Arrays

## Insertion
*Insertion* is putting a value somewhere in the middle of the array. This is done by shifting values to the right, and doing whatever we wish with the position we shifted from. Lets look at this sample of code:
``` java
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] list = {1, 2, 3, 4, 5};
        
        // Select position
        System.out.print("Which position would you like to insert your value? ");
        int position = scan.nextInt();
        // Insertion
        for (int i = list.length - 1; i > position - 1; i--) {
            list[i] = list[i - 1]; // We start from the end of the array, and keep replacing the values in the list until we reach the desired position. We replace each current position with the one that comes before it. So for example, we have:
            // 1 | 2 | 3 | 4 | 5
            // We choose the position 4, which is actually index 3, hence `position - 1`. 
            // Starting from the end of the list, replace the values until we reach index 3
            // 4 | 4 | Stop, because i, which is equal to 3, is no longer less then 4 - 1 = 3. 
            // Final output: 1 | 2 | 3 | 4 | 4
        }
        // Print out values
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }

        // Insert value
        System.out.println("\nWhat value do you want to insert?");
        int value = scan.nextInt();
        list[position - 1] = value; // Simply replace index 3 with the desired number! Replace it with 0 to see the best effect. 
        // Print out values
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }
    }
}
```
## Deletion
*Deletion* is simply removing a value in an array. When we do this, we instead shift to the left, and change the value of the position we shifted from. Lets look at the following code to see what that looks like:
``` java
import java.util.Scanner;

public class Deletion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] list = {1, 2, 3, 4, 5};
        
        // Select position
        System.out.print("Which position would you like to delete? ");
        int position = scan.nextInt();
        // Deletion
        for (int i = position - 1; i < list.length - 1; i++) {
            list[i] = list[i + 1]; // Similiar to before, except now we start at the index (position - 1) we want to delete. Right away, we replace that index's value with the value of the index ahead of it, and keep doing so until the rest of the array is complete. Keep in mind it continues until it is no longer less than the current length, -1. 
            // The final output, when we choose position 4, will be:
            // 1 | 2 | 3 | 5 | 5
        }
        // Print out values
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }

        // Insert value
        System.out.println("\nSelect a value to add at the end of the current array");
        int value = scan.nextInt();
        // Can select any value, but select 6 in order to show purpose of deletion better
        list[list.length - 1] = value;
        // Print out values
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }
        // Output: 1 | 2 | 3 | 5 | 6
    }
}
```

## Shifting Elements (Right or Left)

*Shifting* is the same process as deletion or insertion, except when moving to the left, the first element becomes the last element, or in the case of moving to the right, the last element becomes the first element. 

**Shifting Forward/To the left**
``` java
public class test {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        
        // Temporary variable to hold the first value of the array
        int temp = list[0];
        for (int i = 0; i < list.length - 1; i++) {
            list[i] = list[i + 1]; // Traverse from the beginning of the list, and add 1 to the value of each except forr the last one.
        }
        // Set last value in list to the temporary value, which was the first value
        list[list.length - 1] = temp;
        
        // Print out values
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }
    }
}
```

**Shifting Backwards/To the right**
``` java
public class test {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        
        // Set temporary variable to the last list item
        int temp = list[list.length - 1];
        for (int i = list.length - 1; i > 0; i--) {
            list[i] = list[i - 1]; // Start from the 2nd to final index, and move down the list, subtracting one from each value
        }
        // Set first list item to temp, which was the last list item
        list[0] = temp;
        
        // Print out values
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }
    }
}
```

## Reversing Elements

Using a temporary variable, we are able to swap the values of items in the list in such a way that it becomes reversed. In order to make sure we do this correctly, pay very close attention to bounds and indices!
``` java
public class test {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        
        // The loop will stop at index 2, because the length, 5, divided by 2, is 2 as an int. 2 is not less than 2, so the loop must end
        for (int i = 0; i < list.length / 2; i++) {
            int j = list.length - i - 1; //index of element in end half
            int temp = list[i]; // Set temporary value equal the current value
            list[i] = list[j]; // Set the current value equal to the element that is going to be swapped
            list[j] = temp; // Set the variable that was swapped, equal to the temporary value holding the selected value.
        }
        
        // Print out values
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }
    }
}
```

