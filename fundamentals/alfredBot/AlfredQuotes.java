package assignments_java.fundamentals.alfredBot;


import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    /**
     * 	"Hello, Beth Kane. Lovely to see you."
     * @param name
     * @return
     */
    public String  guestGreeting(String name) {
        // YOUR CODE HERE
        double age = 42.0;
        return String.format("Hello, %s. Lovely to see you %6s %-3f", name, name, age);
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "" + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        return "for snarky response return string";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

