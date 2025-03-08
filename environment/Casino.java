
import java.util.Scanner;


/**
 * the casino class
 */
public class Casino {

    // the attribute
    public static String betType;

    public static void main(String[] args) {

        // welcome message
        System.out.println("Welcome to the Casino Game!");
            
        // creating a scanner object
        Scanner scanner = new Scanner(System.in);

        // taking in a input for the name of the player
        System.out.print("What is Player 1's Name: ");
        String playerOneName = scanner.nextLine();

        // taking in the type of bet the player wants to make
        System.out.print("Choose Between Color or Single Number: ");

        betType = scanner.nextLine();
        System.out.println("Player 1's Name is: " + playerOneName);
        System.out.println("PLayer 1's Bet Type: " + betType);

        String betChoice = bet(betType, scanner);
        System.out.println("The Bet is: " + betChoice);

        // closing the scanner
        scanner.close();

    }



    /**
     * the bet method that returns the bet of the user
     * @param userBetInput the type of bet the user wants
     * @param scanner the scanner object being passed in
     * @return the color or the number for the bet
     */
    private static String bet(String userBetInput, Scanner scanner) {

        String returnBet = "";

        // if the user has chosen the color option
        if(userBetInput.equalsIgnoreCase("Color")) {

            // choosing between red or black 
            System.out.print("Red or Black: ");
            returnBet = scanner.nextLine();

        }

        // if the user chosen the number option
        if(userBetInput.equalsIgnoreCase("Single Number")) {

            // choosing a number
            System.out.print("Choose a Number (1-36): ");
            returnBet = scanner.nextLine();

        }

        // returning the string
        return returnBet;
    
    }
}
