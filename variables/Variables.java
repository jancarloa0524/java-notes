/*
Primitive data types are stored directly in a variable, by allocating memory and storing both the data and variable name there. 
Starts lowercase.
They hold one piece of data at a time.

Class (or reference) data types store a memory reference to where the data is stored. So, where the variable name is stored, is the location for the actual stored data.  
Starts uppercase.
Holds many pieces of data at a time.

When assigning Primitive data types, we change the value stored in memory. But when we assign a Class data type, we are changing the reference data of the value stored to memory in the variable.
So, when we have a String class, it is known as immutable. This is because once we create a String, we can't actually change it becasue the variable only holds a reference to the value we stored. Instead, it can be reassigned to a new memory address. 
 
A Class that holds no data, holds null.
 */
public class Variables {
    public static void main(String[] arg) {
        // Hold a sequence of characters. The following is known as a string literal
        System.out.println("\tThe following is all about strings.\n");
        String greeting = "Hello World";
        System.out.println(greeting);
        // Meanwhile the following is known as a string object
        String goodbye = new String("Goodbye World!");
        System.out.println(goodbye);
        // Strings can be concatenated, but they are also immutable, meaning their value cannot be changed, the memory address to the desired value can only be changed.
        String a = "CSA";
        String b = a; 
        a = "AP"; // a's memory addressed has changed from the memory address storing "CSA" to a new memory address storing "AP". Something points to something else!
        System.out.println(a + " " + b);
        // It is important to understand how Java processes Strings. Whatever you want Java to process first, PUT IN PARENTHESIS!
        int c = 2;
        int d = 3;
        System.out.println("This is a string literal, anyway, 2 + 3 = " + c + d + "???");
        System.out.println("This is a string literal (again), anyway, 2 + 3 = " + (c + d) + "! The int's are processed first as they are in parenthesis.");

        System.out.println("\n\tThe following is all about primitives.\n");
        /*
        int, double, boolean, char, byte, short, and long are primitve data types .
        The following are also "literals" which can be concatenated with other variables of the same type. Ints' and Doubles can mix as a result.
        */
        // Integers store only whole values either in the positive or negative range. I believe the max and minimum is about 2 billion and -2 billion. Small in memory
        int number = 7;
        System.out.println(number);
        // Max and Min Values for integers. Integers greater/less than the max/min will cause an integer overflow. ONLY when adding/subtracting 1 from these variables, will it flip to being +/-
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
        // Doubles can store decimal values, so it can store very large or small values. Take up more memory due to decimal component.
        double decimal = 2.2;
        System.out.println(decimal);
        // You can add the keyword "final" so that this value cannot be changed, only used throughout code.
        final double pi = 3.14159265;

        // Booleans can only return true or false, single bit of memory
        boolean playingHalo = true;
        System.out.println(playingHalo);

        // Char can hold any character, but must be surrounded by 'single quotes'
        char firstLetterOfMyName = 'J';
        System.out.println(firstLetterOfMyName);

        // Bytes have a range of -128 to 127, useful for saving memory in large arrays where memory saving matters. Can be used in place of int where the limits help clarify the code, can also serve as a form of documentation.
        byte byteSized = 127;
        byteSized++;
        System.out.println(byteSized);

        // Shorts have a range of -32,768 to 32,767, also useful for saving memory in large arrays where memory saving matters.
        short shortNumber = 32767;
        shortNumber++;
        System.out.println(shortNumber);

        long longNumber = 9223372036854775807L;
        longNumber++;
        System.out.println(longNumber);


    }
}

