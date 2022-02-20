
/**
 * Assignment_1 – Scooter Rental Program - Provides information on the rental services which includes prices,minimum rent and rental rates.
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
        System.out.println("Choose Rental Type (D - Daily or H - Hourly): ");
        String RentalType = in.nextLine().toUpperCase();
        
        //Rental type calculations based on choices inputted
        if (RentalType.equals("D")){
        
        }else
        System.out.println("Your charge is " + " for" + " hours");
        System.out.println("Please confirm if you want to proceed, Y or N: ");
        String decision = in.nextLine().toUpperCase();
        
        //Output message if recipient chooses "N"(No)
        if (decision.equals("N")){
        System.out.println("Transaction is cancelled");
        System.out.println("              /");
        System.out.println("             o--o");
        System.out.println("Scoot With Us Rentals");
        System.out.println("See you next time");
        
        //Recipient chooses to proceed and is prompted to enter in personal information for payment
        }else
        System.out.println("Enter scooter code:");
        String ScooterCode = in.nextLine();
        System.out.println("Enter payment information");
        System.out.println("Enter Credit Card Type - V(Visa) M(Mastercard) A(Amex): ");
        String CreditCard = in.nextLine();
        System.out.println("Card number: ");
        String CardNumber = in.nextLine();
        System.out.println("Name on card: ");
        String Name = in.nextLine();
        System.out.println("Expiry (MMYY): ");
        String Expiry = in.nextLine();
        System.out.println("Press Enter to unlock and start:");
        in.nextLine();
        System.out.println("Ride safely!");
        
        //Receipt output and display
        System.out.println("------------------------------");
        System.out.println("+          Receipt           +");
        System.out.println("------------------------------");
        Date currentDateTime = new Date();
        System.out.println("" + new Date());
        System.out.println();
        System.out.println("Initial charge       $"  );
        System.out.println("Rental minutes       $"  );
        System.out.println("Rental Rate          $"  );
        System.out.println();
        System.out.println("Total                $"  );
        String LastFourDigits = CardNumber.substring(12, 16);
        System.out.println("Card ..." + LastFourDigits);
        System.out.println();
        System.out.println();
        System.out.println("Thank you for renting from us!");
    }
}

