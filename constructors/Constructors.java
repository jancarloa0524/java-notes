public class Constructors {
    public static void main(String[] args) {
        // We use the keyword "new" to set aside memory for an object. A "constructor" is then called to set up the object we want. Always has the same name as it's class. 
        Rectangle r1 = new Rectangle();
        // The following constructors accept parameters. Despite these all being the same name, they are able to be called seperately because of "Overloaded" constructors.
        Rectangle r2 = new Rectangle(4.2);
        Rectangle r3 = new Rectangle(1.8, 2.5);
        // Cont. from last comment, the reason for this is all of the above have different parameters types, variable names, and parameter orders. These are called "formal parameters". 

        System.out.println("r1: " + r1 + "\nr2: " + r2 + "\nr3: " + r3);
    }
}