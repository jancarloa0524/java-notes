public class randomOddNumbers {
    public static void main(String[] args) {
        // Odd Numbers Only ( 1- 100)
        for (int i = 0; i < 100; i++){
            double ran = Math.random();
            int min = 1;
            int max = 49;
            int range = max - min + 1;
            // Same formula as even numbers, except just add 1, and cut the max to 49 (which gives a true max of 98) instead!
            double answer = (((int)(ran * range) + min) * 2) + 1;
            System.out.println(answer);
        }
    }
}