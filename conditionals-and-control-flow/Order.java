/*
  if-then statements basicallly check to see if a boolean value in it's parenthesis are true in order to run some code.
  We then have:
  if-then-else
  if-then-else chains
  and switch:
  which is the same as an if-then-else chain

  You can also do if-then conditions within if-then conditions.
*/
public class Order {
  boolean isFilled;
  double billAmount;
  String shipping;
  
  public Order(boolean filled, double cost, String shippingMethod) {
		if (cost > 24.00) {
      System.out.println("High value item!");
    } else {
      System.out.println("Low value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
  }
  
  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
    } else {
      System.out.println("Order not ready");
    }
    
    double shippingCost = calculateShipping();
    
    System.out.println("Shipping cost: ");
    System.out.println(shippingCost);
  }
  
  public double calculateShipping() {
    double shippingCost;
    // Switches are really important to understand, whatever is in the switch parenthesis is basically being checked to match the "case" values. So, in this case, it is false, but in the next, it is true. Remember to include a break, as without it, the rest of the code afterwards runs as well, despite a true value already being found.
    switch (shipping) {
      case "Regular":
        shippingCost = 0;
        break;
      case "Express":    
        shippingCost = 1.75;
        break;
      default:
        shippingCost = .50; 
    }
    return shippingCost;
 	}
  
  public static void main(String[] args) {
    // create instances and call methods here!
    Order games = new Order(false, 60, "Express");
    games.ship();
  }
}
