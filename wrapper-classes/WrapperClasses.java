// A wrapper class "wraps" a primitive in a class, so an int in an Integer, or a double, in a Double. Found in the java.lang package (no need to import).
/*
Why is this useful?
Some classes use data that must be stored as references in memory, rather than directly stored in memory. Wrapper Classes do exactly this. 
*/
public class WrapperClasses {
    public static void main(String[] args) {
        // The following code is deprecated, meaning it really just isn't useful anymore. However, it is still usable. 
        Integer n1 = new Integer(45);
        Integer n2 = new Integer(30);
        System.out.println(n1.equals(n2));

        // Autoboxing and Unboxing
        // Wrapper classes in very early versions of Java were converted to primitves from the wrapper class in ways such as the "intValue" method. More recent versions of Java take care of this on their own most of the time, however
        // Autoboxing: when given an int value while expecting an Integer, it can automatically convert the int to an Integer. 
        Integer a = 10;
        System.out.println(a.compareTo(-7));

        // Unboxing: Converts an Integer to an int
        Integer obj = new Integer(18);
        int k = obj;
        System.out.println(k);

        // Auto/Unboxing allows us to move seamlessly between primitves and wrapper classes:
        Integer b = 5;
        Integer c = 10;
        Integer d = b + c;
        System.out.println(d);
        // In the above code: 
        // 1. b and c are "autoboxed", which means they have both gone from int's to Integers. 
        // 2. Then, d takes those Integers, turns them back into int's
        // 3. d then converts that result back into an integer in order to be printed. 
    }
}