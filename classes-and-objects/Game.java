// Classes define STATE and BEHAVIOUR of their instances. 
public class Game {
    // The following are called "Instance Variables"
    String gameTitle;
    int listPrice;
    double userRating;
    boolean hasMultiplayer;

    // constructor method: this is what defines the state of an object, this being the initial state of one. These must have parameters
    /*
        !!! AP EXAM NOTE !!!
    The following parameters are known as "formal parameters" because it specifices the type and name of data that is passed through a method. An "Actual Parameter", or argument, refers to the value being passed during a method call. 
    */
    public Game(String title, int price, double rating) {
        // You assign parameter values to instance variables here. The called instance value = parameter value = instance variable.
        gameTitle = title;
        listPrice = price;
        userRating = rating;
    }

    /*
        !!! AP EXAM NOTE !!!
    You can have multiple constructors due to "constructor overloading". As long as they have different parameter values, these work. This is because, when creating the other instance of the second constructor, that instance's parameters match the ones for this constructor.
    */

    public Game(String title, int price, boolean multiplayer) {
        gameTitle = title;
        listPrice = price;
        hasMultiplayer = multiplayer;
    }

    public static void main(String[] args){
        // These are instances of the class "Game". !!! AP EXAM NOTE !!! Within these instances are "actual parameters"
        Game halo = new Game("Halo", 20, 9.2);
        Game halfLife = new Game("Half-Life", 10, 9.9);
        Game callOfDuty = new Game("Call of Duty", 60, true);

        /*
            !!! AP EXAM NOTE !!!
        "Call by value" is the process of calling a method with an "actual parameter". When the "actual parameter" has passed, the formal parameter is initialized with a copy of the "actual parameter". Kind of like, just creating something off of a template. 
        */
        
        Game dontExist = new Game("Fake Game", 1000, 10.0);
        /*
            !!! AP EXAM NOTE !!!
        If we assign null to an object, it would become a void reference.
        If we use a null reference to call a mathod or access an instance variable, you will recieve a NullPointerException Error
        */
        dontExist = null;

        // You can go into specific instances' values with a period followed by the instance variable name.
        boolean isHaloHigherRating = halo.userRating > halfLife.userRating;

        System.out.println(halo); // This will print out "Game" followed by "@x", where x is a string of numbers and letters, indicating the instance's location in computer memory.
        System.out.println(dontExist);
        // System.out.println(dontExist.userRating); !!! AP EXAM NOTE !!! This is the NullPointerException Error mentioned earlier
        System.out.println("Is Halo a higher rated game than Half-Life? " + isHaloHigherRating);
        System.out.println("Call of Duty has multiplayer? " + callOfDuty.hasMultiplayer);

    }
}