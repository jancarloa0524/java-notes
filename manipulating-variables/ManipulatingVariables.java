public class ManipulatingVariables {
    public static void main(String[] arg) {
        // You can use +,-,*, and / to perform calculations. You can also use % to find the remainder of two numbers.
        int add = 2 + 2;
        int subtract = 4 - 2;
        int multiplication = 2 * 2;
        int division = 4 / 2;
        int modulo = 9 % 5;

        System.out.println("The following is done with operators");
        System.out.println("2 + 2 = " + add);
        System.out.println("4 - 2 = " + subtract);
        System.out.println("2 * 2 = " + multiplication);
        System.out.println("4 / 2 = " + division);
        System.out.println("9 % 5 = " + modulo);

        // You can also use compound assignment operators +=, -=, *=, /=, %=
        add += 2;
        subtract -= 1;
        multiplication *= 2;
        division /= 2;
        modulo %= 3;

        System.out.println("The following is done with compound operators");
        System.out.println("4 + 2 = " + add);
        System.out.println("2 - 1 = " + subtract);
        System.out.println("4 * 2 = " + multiplication);
        System.out.println("2 / 2 = " + division);
        System.out.println("4 % 3 = " + modulo);

        // You can compare if vales are <, >, <=, >=, ==, or !=

        boolean isGreaterThan = 2 > 1;
        boolean isLessThan = 1 < 2;
        boolean isGreaterThanOrEqualTo = 1 >= 2;
        boolean isLessThanOrEqualTo = 2 <= 1;
        boolean isEqualTo = 1 == 1;
        boolean isNotEqualTo = 2 != 1;

        System.out.println("The following is done with comparison operators");
        System.out.println("is 2 > 1? " + isGreaterThan);
        System.out.println("is 1 < 2? " + isLessThan);
        System.out.println("is 1 >= 2? " + isGreaterThanOrEqualTo);
        System.out.println("is 2 <= 1? " + isLessThanOrEqualTo);
        System.out.println("is 1 == 1? " + isEqualTo);
        System.out.println("is 2 != 1? " + isNotEqualTo);

        /*
        double and int division behaviour
        */
        // The following calculation will produce an integer. Because integers do not include decimals, the actual answer will be rounded down to create the output. 9 / 2 = 4.5, but 4.5 cannot be an int, so it is rounded down to 4.
        int x1 = 9;
        int y1 = 2;
        System.out.println(x1 / y1);

        // Even if you put it into a double, it will not work correctly, since it is still two ints being divided by eachother.
        int x2 = 9;
        int y2 = 2;
        double z2 = x2 / y2;
        System.out.println(z2);

        // Added a double to the equation will then allow the program to calculate the answer correctly as a double.
        int x3 = 9;
        int y3 = 2;
        double z3 = 1.0 * x3 / y3;
        System.out.println(z3);

        // You can also divide an int by a double, and recieve the correct answer as a double!
        int x4 = 9;
        double y4 = 2;
        System.out.println(x4/y4);

        // You cannot convert a double to an int, however. 
    }
}