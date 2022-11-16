public class randomEvenNumbers {
    public static void main(String[] args) {
        // Even Numbers Only ( 1- 100)
        for (int i = 0; i < 100; i++){
            double ran = Math.random();
            int min = 1;
            int max = 50;
            int range = max - min + 1;
            double answer = ((int)(ran * range) + min) * 2;
            System.out.println(answer);
        }
    }
}