import java.util.Date;
import java.text.*;
import java.time.LocalDateTime;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    // public String guestGreeting(String name) {
    //     // YOUR CODE HERE
    //     return String.format("Hello %s. Lovely to see you", name);
    // }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        // return "for snarky response return string";
        if(conversation.indexOf("Alexis") > -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } 
        else if(conversation.indexOf("Alfred") > -1) {
            return "At your service. As you wish, naturally.";
        } 
        else {
            return "Right. And with that I shall retire.";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Lovely to see you", dayPeriod, name);
    }

    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
    public String yellMessage(String message) {
        if(message.indexOf("Alfred") > -1) {
            return "That's enough! I need a vacation!!!";
        } else {
            return "Are you talking to me?";
        }
    }
}

