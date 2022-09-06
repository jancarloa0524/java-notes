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
    }
}