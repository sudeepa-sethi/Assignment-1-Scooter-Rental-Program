
/**
 * Assignment_1 - Write a description here.
 * 
 * @author David Doan 
 * @version (a version number or a date)
 */
// Standard import for the Scanner class
import java.util.*;
public class Assignment_1 
{
    public static void main (String [] args) 
    {
        // Create a Scanner object attached to the keyboard
        Scanner in = new Scanner (System.in);
        //Opening Message
        System.out.println("Welcome to Scoot With Us Rentals");
        System.out.println("Our scooter rental rates are as follows:");
        System.out.println("Daily Rate (8 hours max): $50.00");
        System.out.println("Hourly Rate : $1.00 to unlock + $0.30/minute");
        System.out.println("Minimum Rental : $5.00");
        System.out.println();
        System.out.println("Choose Rental Type (D - Daily or H - Hourly): ");
        String RentalType = in.nextLine().toUpperCase();
        //Rental type calculations
        if (RentalType.equals("D")){
        
        }else
        System.out.println("Your charge is " + " for" + " hours");
        System.out.println("Please confirm if you want to proceed, Y or N: ");
        String decision = in.nextLine().toUpperCase();
        //Functions and receipt if recipient chooses "N"(No)
        if (decision.equals("N")){
        System.out.println("Transaction is cancelled");
        System.out.println("              /");
        System.out.println("             o--o");
        System.out.println("Scoot With Us Rentals");
        System.out.println("See you next time");
        //Recipient chooses to proceed and is prompted to enter in personal information
    }else{
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
        //Receipt output
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
}

