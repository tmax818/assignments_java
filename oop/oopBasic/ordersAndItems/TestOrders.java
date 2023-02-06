import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        item1.name = "Mocha";
        item1.price = 3;
        Item item2 = new Item();
        item2.name = "Latte";
        item2.price = 3.25;
        Item item3 = new Item();
        item3.name = "drip";
        item3.price = 1.25;
        Item item4 = new Item();
        item4.name = "capppuccino";
        item4.price = 2.25;
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
    }
}
