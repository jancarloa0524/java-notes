class Noodle {
  // "protected" basically allows the following doubles' to be "private", and yet, not private. Its instance variables are only available to its child classes.
  protected double lengthInCentimeters;
  protected double widthInCentimeters;
  protected String shape;
  protected String ingredients;
  protected String texture = "brittle";
  
  // Constructor of Noodle class
  Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
    
    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;
    
  }
  
  public String getCookPrep() {
    
    return "Boil noodle for 7 minutes and add sauce.";
    
  }
  // Basically, if anyone else were to try adding a "isTasty()" boolean to any of the sub-classes in order to override the following boolean, it woudln't work.
   public final boolean isTasty() {
    System.out.println("Is " + this + " tasty?");
    return true;
  }

  public void cook() {
    System.out.println("Boiling...");
    System.out.println("Cooked!");
  }
  
  public static void main(String[] args) {
    Spaghetti spaghetti = new Spaghetti();
    System.out.println(spaghetti.isTasty());
    spaghetti.cook();

    // *** Here, we are calling a Pho object as if it were a Noodle object. The compiler considers "pho" to be a Noodle, but since method override is handled at runtime, we can get Pho() specific results. However, if getCookPrep() didn't exist in Noodle.java, then we wouldn't be able to use it like we do here. 
    Noodle pho = new Pho();
    System.out.println(pho.getCookPrep());

    // We can put these sub-classes into arrays, and iterate through them!
    Noodle mysteryPasta1, mysteryPasta2, mysteryPasta3;
    mysteryPasta1 = new Spaghetti();
    mysteryPasta2 = new Ramen();
    mysteryPasta3 = new Pho();
    Noodle[] noodles = {mysteryPasta1, mysteryPasta2, mysteryPasta3};

    for (Noodle mysteryNoodle : noodles) {
        System.out.println(mysteryNoodle.isTasty());
    }
  }
  
  
  
}