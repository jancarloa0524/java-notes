// In the following lines of code, you are essentially "extending" traits of a Noodle, to Spaghetti. We can see this when using "super". This makes Spaghetti.java a subclass or Noodle.java.
class Spaghetti extends Noodle {
  
  Spaghetti() {
    // When using "extends", the subclass is able to inherit the constructor of it's parent class. All you have to do is type "super" and the parameters of it's parent constructor to use it. 
  	super(30.0, 0.2, "round", "semolina flour");
    
  }
  
  public String getCookPrep() {
    
    return "Boil spaghetti for 8 - 12 minutes and add sauce, cheese, or oil and garlic.";
    
  }
  
  @Override 
  public void cook(){
    System.out.println("Italian Mode, activated!");
    System.out.println("Boiling...");
    System.out.println("Cooked!");
  }
}