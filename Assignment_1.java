
/**
 * Assignment_1 ? Scooter Rental Program - Provides information on the rental services which includes prices, minimum rent and rental rates.
 *                                         Allows the customer to pick their preferences on rates and have it calculated automatically.
 *                                         Prints out a receipt on their purchase after personal information has been inputted and payment is completed.
 * 
 * @author David Doan , Sudeepa Sethi
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
else if( rentalType.equalsIgnoreCase("h")){
			System.out.print("How long do you want to rent for? (minutes):");
			int minutesOfRent = in.nextInt();

			// nextInt reads only the integer inputs ignoring all other values so on typing integer value when we
			// press Enter(\n) ,only integer value is being read and the Enter key i.e "\n" gets stored in buffer which would be read later
			// when we try to take input by the nextLine() statement in the code :-  String yesOrNo = in.nextLine();
			//So in that case we won't be able to provide valid input to variable yesOrNo because by default it would've read the
			// "\n" character in buffer . So I'm using in.nextLine() in the next step  itslef so that 
			// "\n" present in buffer can be read here instead which would allow me to successfully add input later to
			// yesOrNo String.
			in.nextLine();
			double charges = (1 + 0.30 * minutesOfRent);
			if(charges < 5){

				// when charges come out to be less than 5 dollars then in that case minutesOfRent
				// will also be changed as per the minimum charge i.e $5
				//If the user is paying minimum $5 that means he's paying $1 to unlock and the 
				// rest $4 he's using for per Minute Rate;Now applying basic unitary method
				// For $0.30,he gets = 1 minutes of rental time
				// For $1 ,he would get = 1/0.30 minutes of rental Time
				// For $ 4,he gets = 4*(1/0.30) = 13.33 minutes of rental time
				//Taking 13 as fractional minutes of rental time are not allowed
				charges = 5;
				minutesOfRent = 13;
				// For minimum default charges ,calculated the default minutes applicable for $5 which comes out to be 13				
				System.out.println("Your charge is $5.00 for " + minutesOfRent + " minutes ");


			}
			else {
				System.out.printf("Your charge is $%f  for   %d   minutes %n ", charges,minutesOfRent);

			}


			System.out.print("Please confirm if you want to proceed, Y or N: "); 
			String yesOrNo = in.nextLine();
			if( yesOrNo.equalsIgnoreCase("Y")){
				System.out.print("Enter scooter code: " );
				String scooterCode = in.nextLine();
				System.out.println("Enter payment information");
				System.out.print("Enter Credit Card Type - V(Visa) M(Mastercard) A(Amex): ");
				String enterCreditCardType = in.nextLine();
				System.out.print("   Card number: " );
				String cardNumber = in.nextLine();
				System.out.print("   Name on card: ");
				String name = in.nextLine();
				System.out.print("   Expiry(MMYY): ");
				String expiry = in.nextLine();
				System.out.println("Press Enter to unlock and start: ");
				System.out.println("Ride Safely! ");
				System.out.println("------------------");
				System.out.println("+    Receipt   + ");
				System.out.println("------------------");
				Date currentDateTime = new Date();
				String date = currentDateTime.toString();
				System.out.println(date);
				System.out.println("Initial charges    $1.00 ");
				System.out.println("Rental minutes   " + minutesOfRent );
				System.out.println("Rental rate   $0.30" );
				System.out.println("Total    $" + charges);
				//Calculating the length of credit card number during runtime and using that value ,extracting the 
				// required substring which is the last 4 numbers of credit card
				int lengthOfCreditCardNo = cardNumber.length();
				System.out.println("Card ..." + cardNumber.substring(lengthOfCreditCardNo-4) + "    $" + charges );
				System.out.println("Thank you for renting from us!");
				System.out.println("              /");
				System.out.println("             o--o");
				System.out.println("Scoot With Us Rentals");
				System.out.println("See you next time");


			}
			else{
				System.out.println("Transaction is cancelled");
                else if( rentalType.equalsIgnoreCase("h")){
			System.out.print("How long do you want to rent for? (minutes):");
			int minutesOfRent = in.nextInt();

			// nextInt reads only the integer inputs ignoring all other values so on typing integer value when we
			// press Enter(\n) ,only integer value is being read and the Enter key i.e "\n" gets stored in buffer which would be read later
			// when we try to take input by the nextLine() statement in the code :-  String yesOrNo = in.nextLine();
			//So in that case we won't be able to provide valid input to variable yesOrNo because by default it would've read the
			// "\n" character in buffer . So I'm using in.nextLine() in the next step  itslef so that 
			// "\n" present in buffer can be read here instead which would allow me to successfully add input later to
			// yesOrNo String.
			in.nextLine();
			double charges = (1 + 0.30 * minutesOfRent);
			if(charges < 5){

				// when charges come out to be less than 5 dollars then in that case minutesOfRent
				// will also be changed as per the minimum charge i.e $5
				//If the user is paying minimum $5 that means he's paying $1 to unlock and the 
				// rest $4 he's using for per Minute Rate;Now applying basic unitary method
				// For $0.30,he gets = 1 minutes of rental time
				// For $1 ,he would get = 1/0.30 minutes of rental Time
				// For $ 4,he gets = 4*(1/0.30) = 13.33 minutes of rental time
				//Taking 13 as fractional minutes of rental time are not allowed
				charges = 5;
				minutesOfRent = 13;
				// For minimum default charges ,calculated the default minutes applicable for $5 which comes out to be 13				
				System.out.println("Your charge is $5.00 for " + minutesOfRent + " minutes ");


			}
			else {
				System.out.printf("Your charge is $%f  for   %d   minutes %n ", charges,minutesOfRent);

			}


			System.out.print("Please confirm if you want to proceed, Y or N: "); 
			String yesOrNo = in.nextLine();
			if( yesOrNo.equalsIgnoreCase("Y")){
				System.out.print("Enter scooter code: " );
				String scooterCode = in.nextLine();
				System.out.println("Enter payment information");
				System.out.print("Enter Credit Card Type - V(Visa) M(Mastercard) A(Amex): ");
				String enterCreditCardType = in.nextLine();
				System.out.print("   Card number: " );
				String cardNumber = in.nextLine();
				System.out.print("   Name on card: ");
				String name = in.nextLine();
				System.out.print("   Expiry(MMYY): ");
				String expiry = in.nextLine();
				System.out.println("Press Enter to unlock and start: ");
				System.out.println("Ride Safely! ");
				System.out.println("------------------");
				System.out.println("+    Receipt   + ");
				System.out.println("------------------");
				Date currentDateTime = new Date();
				String date = currentDateTime.toString();
				System.out.println(date);
				System.out.println("Initial charges    $1.00 ");
				System.out.println("Rental minutes   " + minutesOfRent );
				System.out.println("Rental rate   $0.30" );
				System.out.println("Total    $" + charges);
				//Calculating the length of credit card number during runtime and using that value ,extracting the 
				// required substring which is the last 4 numbers of credit card
				int lengthOfCreditCardNo = cardNumber.length();
				System.out.println("Card ..." + cardNumber.substring(lengthOfCreditCardNo-4) + "    $" + charges );
				System.out.println("Thank you for renting from us!");
				System.out.println("              /");
				System.out.println("             o--o");
				System.out.println("Scoot With Us Rentals");
				System.out.println("See you next time");


			}
			else{
				System.out.println("Transaction is cancelled");


