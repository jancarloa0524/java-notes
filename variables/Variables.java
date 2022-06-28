public class Variables {
    public static void main(String[] arg) {
        // Hold a sequence of characters. The following is known as a string literal
        String greeting = "Hello World";
        // Meanwhile the following is known as a string object
        String goodbye = new String("Goodbye World!");

        // Integers store only whole values either in the positive or negative range. I believe the max and minimum is about 2 billion and -2 billion
        int number = 7;
        // Doubles can store decimal values, so it can store very large or small values.
        double decimal = 2.2;
        // Booleans can only return true or false
        boolean playingHalo = true;
        // Char can hold any character, but must be surrounded by 'single quotes'
        char firstLetterOfMyName = 'J';

        System.out.println(greeting);

        System.out.println(goodbye);

        System.out.println(number);

        System.out.println(decimal);

        System.out.println(playingHalo);

        System.out.println(firstLetterOfMyName);
    }
}

