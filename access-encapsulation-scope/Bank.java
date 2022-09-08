public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank(){
    // Here, we access another class entirely, and add them to the "Bank"
    accountOne = new CheckingAccount("Zeus", 100, "1");
    accountTwo = new CheckingAccount("Hades", 200, "2");
  }

// Here, we are able to both display and manipulate data, using the functions available to us via the Checking Account. However, not all functions are availabe to us, instead the Checking Account does this stuff for us, privately.
  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.setBalance(5000);
    System.out.println(bankOfGods.accountOne.getBalance());

    System.out.println(bankOfGods.accountOne.getMonthlyInterest());
    
    // Here, we are now using a method to recieve information that is otherwise private. Check CheckingAccount.java for ^^^ indicator.
    bankOfGods.accountOne.getAccountInformation();

  }

}