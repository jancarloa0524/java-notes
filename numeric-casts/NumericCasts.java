class NumericCasts {
    public static void main (String[] args) {
        /*
        int x = 9;
        int y = 2;
        double z = 1.0 * x / y;
        System.out.println(z);

        // The above code can be done the exact same way with the following:
        */

        int x1 = 9;
        int y1 = 2;
        double z1 = (double) x1 / y1;
        System.out.println(z1);

        double x2 = 7 / 2; // x has value 3, but no error is thrown. This is because you are calculating two integers, which will result in "truncating" (cutting out decimal part).
        double y2 = (double) 7 / 2; // y has value 3.5, because the integers are then converted to doubles, and then calculated. 
        System.out.println(x2);
        System.out.println(y2);

        int x3 = (int) 3.5; // y has value 3, no error. It is converted from a double to an int. 
        System.out.println(x3);

        // You can round by adding 0.5 to whatever decimal you want to round, because it will always truncate when converting.
        double num = 2.8;
        int roundNum = (int) (num + 0.5);
        System.out.println(roundNum);

        /*
        Double	    + or - 0.5	    Cast to an Int
        2.1	        2.6	            2
        2.7	        3.2	            3
        -2.1	    -2.6	        -2
        -2.5	    -3.0	        -3
        */
    }
}