The Bank.java file uses the CheckingAccount.java file to display information about a checking account.

Some of the data in CheckingAccount.java is only accessible to Bank.java by sort of requesting it, rather than simply allowing public access. This is done with `public` vs. `private` declerations for methods, classes, constructors or instance variables. While it may be confusing and seem useless to practice this, it is actually very helpful when making sure we don't mess with data we don't want to mess with. For example, you don't need the Bank object to mess around and change interest rates. However, we of course can allow the bank to mess around with balance. Instead, the checking account itself will set the interest rate, and calculate whatever calculations need to be made with it. We see this in an example indicated by `^^^` in the comments of the program. 

Encapsulation is a technique used to keep implementation details hidden from other classes. Its aim is to create small bundles of logic.

The `this` keyword can be used to designate the difference between instance variables and local variables.

You can also use `this` to call a method, like shown in the following:
``` java
public class Computer{
  public int brightness;
  public int volume;
 
  public void setBrightness(int inputBrightness){
    this.brightness = inputBrightness;
  }
 
  public void setVolume(int inputVolume){
    this.volume = inputvolume;
  }
 
  public void resetSettings(){
    // We call methods with "this", where we use "this" as the object. The object used to call "resetSettings()" will then call the following methods.
    // !!! AP EXAM NOTE !!! You can also use "this" as a parameter for a method, where "this" is the object that you're using to call the method to begin with. So, you are calling a method with an object, "this", as well as passing it into an object. 
    this.setBrightness(0);
    this.setVolume(0);
  }
}
```

Local variables can only be used within the scope that they were defined in.

The `this` keyword can be used to call methods when writing classes.
