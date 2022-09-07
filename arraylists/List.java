import java.util.ArrayList;

class List {
  
  public static void main(String[] args) {
    ArrayList<String> groceries = new ArrayList<String>();

    groceries.add("Bananas");
    groceries.add("Apples");
    groceries.add("Kiwi");
    System.out.println("The following are current groceries, the size of the array, and getting a specific index");
    System.out.println(groceries);
    System.out.println(groceries.size());
    System.out.println(groceries.get(1) + "\n");

    groceries.remove("Bananas");
    groceries.remove(0);
    System.out.println("The following array no longer has some groceries");
    System.out.println(groceries + "\n");

    groceries.set(0, "Paper Towels");
    groceries.add("Toilet Paper");
    groceries.add("Weapons of Mass Destruction");
    System.out.println("The following array has new items, but is still the same array");
    System.out.println(groceries + "\n");

    System.out.println("The following is the index of \"toilet paper\" in the array");
    System.out.println(groceries.indexOf("Toilet Paper"));
  }
  
}