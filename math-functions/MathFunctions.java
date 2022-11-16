public class MathFunctions {
    public static void main(String[] args) {
        double x = 9.6;
        double y = 2.1;
        // Finds the absolute value
        double dist = Math.abs(y - x);
        System.out.println(dist);

        int a = 2;
        int b = 6;
        // Finds a value to the power of another
        double answer1 = Math.pow(a, b);
        System.out.println(answer1);

        // Finds the square root of a value
        double answer2 = Math.sqrt(answer1);
        System.out.println(answer2);

        // Returns a random value
        double answer3 = Math.random();
        System.out.println(answer3);

        // This is how you get a random num in a range (in this case, 1-100)
        double ran = Math.random();
        int min = 1;
        int max = 100;
        int range = max - min + 1;
        double answer = (int)(ran * range) + min;
        System.out.println(answer);
    }
}