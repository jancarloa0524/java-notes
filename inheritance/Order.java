// The whole point of this file, is to demonstrate using sub-classes as parameters. 
class Order {
    String customer;

    public Order(String customerName) {
        customer = customerName; 
    }
    
    // Here, we are accepting sub-classes as parameters, and will use them as such. 
    public void orderNoodle(Noodle noodle) {
        System.out.println(noodle.isTasty());
        noodle.cook();
        System.out.println("Sending out " + this + " to customer: " + this.customer);
    }

    public static void main(String[] args) {
        Noodle spaghetti, ramen;
        spaghetti = new Spaghetti();
        ramen = new Ramen();

        Order john = new Order("John");

        john.orderNoodle(spaghetti);
        john.orderNoodle(ramen);
    }
}