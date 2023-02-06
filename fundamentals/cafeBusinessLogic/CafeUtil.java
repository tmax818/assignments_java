import java.util.ArrayList;

public class CafeUtil {


/**
* TODO Implement the getStreakGoal method and test.
Cafe Java wants to implement a reward system for customers who always buy more drinks than they did the week before. To calculate how many drinks they need after 10 weeks, write a method that sums together every consecutive integer from 1 to 10 and returns the sum. In other words, add 1 + 2 + 3. and so, on up to 10 and return the result.
* @param None
@return streak goal
*/    
public int getStreakGoal(){
    return 0;
}

/**
 * TODO Implement the printPriceChart method and test.
 * Given a product, price and a maxQuantity, create a method that prints the cost for buying 1, then the price for buying 2, then for 3.. and so on, up to the max. For example, if the product is "Columbian Coffee Grounds" with a price of 15.0 and maxQuantity of 3, you should print:
Columbian Coffee Grounds
1 - $15.00
2 - $30.00
3 - $45.00


 * @param product
 * @param price
 * @param maxQuantity
 * @return null
 */
public void printPriceChart(String product, double price, int maxQuantity){

}


/**
 * TODO Implement the getOrderTotal method and test.
 * @param prices
 * @return total
 */
public double getOrderTotal(double[] prices){
    return 0.0;
}

/**
 * TODO Implement the displayMenu method and test.
 * Let's overload the display menu! Given 2 arrays, an ArrayList of menu items (strings), and an ArrayList of prices (doubles) print a menu!

However, first check: if the arrays are not the same size, immediately return false.

To print the menu, iterate from 0 to the last index. Each time through, print on the same line:

a.) The index, b.) The menu item at that index, and c.) The price at that index.
Finally, return true.
 * @param menuItems 
 */
public void displayMenu(ArrayList<String> menuItems){

}


/**
 * TODO Implement the addCustomer method and test. 
 * 
 * Print this string to the console: "Please enter your name:"
Then add this line of code to get user input from the terminal and store it in the variable userName:

String userName = System.console().readLine();

Next print the userName to the console, saying "Hello, [username here]!"
Next print "There are ___ people in front of you" using the number for how many people are ahead of them (how many items already in the array)
Then, add the customer's name to the given customers list. And print the list.
No need to return anything.
 * @param customers
 */
public void addCustomer(ArrayList<String> customers){
    
}
 

}
