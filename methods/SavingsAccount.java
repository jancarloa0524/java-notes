// Here, we create object BEHAVIOUR using "methods"
public class SavingsAccount {
  
  int balance;
  
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }

/* 
You can create a "method", which acts like a function in JS. 
"public" means that other classes can access this method.
"void" means that there is no specific output
"non-void" methods mean that there is an output, usually explicitely stated by the method. 
"checkBalance()" is the name of the method

When the method is called, all the code within it will run.

It is important to understand that variables within the method remain in its "scope", so you can call variables outside of it, such as "balance", but in the main() method you cannot call variables in the "checkBalance()" method.
    !!! AP EXAM NOTE !!!
Not considered a non-static method due to it's signature not including the word "static"
*/
  public void checkBalance() {
    System.out.println("Hello!");
    System.out.println("Your balance is " + balance);
  }

// methods can take in parameters
/*
    !!! AP EXAM NOTE !!!
You can have mutliple methods of the same name that are all usable as long as the parameters are different, similiar to having multiple "Overloaded" constructors. These are called "Overloaded" methods!
*/
  public void deposit(int amountToDeposit) {
    int totalBalance = balance + amountToDeposit;
    balance = totalBalance; // Here, we are "reassigning" the value of balance to it's new balance.

    System.out.println("You just deposited " + amountToDeposit);
  }

// methods can also include a return value; when this happens, they no longer are "void", the return variable must be stated instead. 
/*
    !!! AP EXAM NOTE !!!
You CAN return an object, although it works a little differently than returning primitive values.
If you return a primitive value, a copy of it is returned.
Instead of an object, you return a reference to the object (SavingsAccount@2f333739)
*/
// This is a "non-void" method
  public int withdraw(int amountToWithdraw) {
    int totalBalance = balance - amountToWithdraw;
    balance = totalBalance;
    System.out.println("You just withdrew " + amountToWithdraw);
    return amountToWithdraw;
  }
  
  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    
    // Instead of creating a bunch of System.out.println(), we only need these methods!
    savings.checkBalance();
    savings.deposit(100);

    savings.checkBalance();
    savings.withdraw(200);
    
    // Without the next method, "toString()", this would display a useless reference. However, "toString()" tells us what the savings account's balance after all the transactions are.
    System.out.println(savings);
    
  }       

  public String toString(){
    return "Total balance after transactions is: " + balance;
  }
}
