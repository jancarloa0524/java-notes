import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
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