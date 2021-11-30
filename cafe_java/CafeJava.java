public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        // drip coffee, latte and cappuccino
        double dripCoffee = 2.5;
        double latte = 3.5;
        double cappuccino = 4.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        // Sam, Jimmy, Noah
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        // System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(customer1 + pendingMessage);

        // Noah ordered a cappuccino. Use an if statement to check the status of his order 
        // and print the status message.
        if(isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
        } else {
            System.out.println(customer4 + pendingMessage);
        }

        // Sam ordered 2 lattes, print the message to display their total.
        // Use an if statement to print the order message 
        // Change the isReady flag value to test your control logic
        System.out.println(displayTotalMessage + 2*latte);
        if(!isReadyOrder2) {
            isReadyOrder2 = true;
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        // Jimmy was charged for a coffee but ordered a latte. 
        // Print the total message with the new total (what he owes) to make up the difference
        System.out.println(displayTotalMessage + (mochaPrice - dripCoffee));

        // Extra testing
        if(!isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
        } else {
            isReadyOrder1 = true;
            System.out.println(customer1 + pendingMessage);
        }
    }
}
