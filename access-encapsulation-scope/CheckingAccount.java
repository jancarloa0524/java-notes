// Here, we use a lot of "this" keywords to help distinguish an instance variable from local variables. Look for *** for an example
public class CheckingAccount{
  private String name;
  private int balance;
  private String id;
  private double interestRate;

  public CheckingAccount(String inputName, int inputBalance, String inputId){
    // *** Here, instead of just saying that name = inputName; we make sure we are calling an instance variable by including "this"
    this.name = inputName;
    this.balance = inputBalance;
    this.id = inputId;
    this.interestRate = 0.02;
  }

  public int getBalance(){
    return this.balance;
  }

// ^^^ While this is a public method, it also calls a method private to CheckingAccount.java, in order to get more private information. 
  public void getAccountInformation(){
    System.out.println("Money in account: " + this.getBalance());
    System.out.println("Next Month's Interest: " + this.calculateNextMonthInterest());
  }

  public void setBalance(int newBalance){
    this.balance = newBalance;
  }

  public double getMonthlyInterest(){
    return this.interestRate * this.balance;
  }

  private double calculateNextMonthInterest() {
    return this.balance * this.interestRate;
  }

}