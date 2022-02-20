
/**
 * Assignment_1 ? Scooter Rental Program - Provides information on the rental services which includes prices, minimum rent and rental rates.
 *                                         Allows the customer to pick their preferences on rates and have it calculated automatically.
 *                                         Prints out a receipt on their purchase after personal information has been inputted and payment is completed.
 * 
 * @author David Doan 
 * @version (February 20, 2022)
 */
// Standard import for the Scanner class
import java.util.*;
public class Assignment_1 
{
    public static void main (String [] args) 
    {
        // Create a Scanner object attached to the keyboard
        Scanner in = new Scanner (System.in);
        
        //Opening Message that provides prices and rates
        System.out.println("Welcome to Scoot With Us Rentals");
        System.out.println("Our scooter rental rates are as follows:");
        System.out.println("Daily Rate (8 hours max): $50.00");
        System.out.println("Hourly Rate : $1.00 to unlock + $0.30/minute");
        System.out.println("Minimum Rental : $5.00");
        System.out.println();
        
        //User inputs preferences
        System.out.print("Choose Rental Type (D - Daily or H - Hourly): ");
        String rentalType = in.nextLine();
        rentalType.toUpperCase(); //Capitalizing letter
        System.out.print("How long do you want to rent for? (minutes): ");
        String minutes = in.nextLine();
        
        //Rental type calculations based on choices inputted
        if (rentalType.equals("D")){
                                                                   PUT CALCULATIONS HERE
    }else //Display amount calculated
        System.out.println("Your charge is " + " for" + " hours");
        System.out.print("Please confirm if you want to proceed, Y or N: ");
        String decision = in.nextLine()
        decision.toUpperCase(); //Capitalizing letter
        
        //Output message if recipient chooses "N"
        if (decision.equals("N")){
        System.out.println("Transaction is cancelled");
        System.out.println("              /");
        System.out.println("             o--o");
        System.out.println("Scoot With Us Rentals");
        System.out.println("See you next time");
        
    }else //Recipient chooses "Y" and is prompted to enter in personal information for payment
        System.out.print("Enter scooter code:");
        String scooterCode = in.nextLine();
        System.out.println("Enter payment information");
        System.out.print("Enter Credit Card Type - V(Visa) M(Mastercard) A(Amex): ");
        String creditCard = in.nextLine();
        System.out.print("Card number: ");
        String cardNumber = in.nextLine();
        System.out.print("Name on card: ");
        String name = in.nextLine();
        System.out.print("Expiry (MMYY): ");
        String expiry = in.nextLine();
        System.out.println("Press Enter to unlock and start:");
        in.nextLine();
        System.out.println("Ride safely!");
        
        //Receipt output and display
        System.out.println("------------------------------");
        System.out.println("+          Receipt           +");
        System.out.println("------------------------------");
        Date currentDateTime = new Date(); //Obtain current time and date
        System.out.println("" + new Date());
        System.out.println();
        System.out.println("Initial charge       $"  );
        System.out.println("Rental minutes       $"  );
        System.out.println("Rental Rate          $"  );
        System.out.println();
        System.out.println("Total                $"  );
        String LastFourDigits = cardNumber.substring(12, 16); //Pulling last 4 credit card digits
        System.out.println("Card ..." + LastFourDigits);
        System.out.println();
        System.out.println();
        System.out.println("Thank you for renting from us!");
        System.out.println();
        System.out.println("              /");
        System.out.println("             o--o");
        System.out.println("Scoot With Us Rentals");
        System.out.println("See you next time");
    }
}

