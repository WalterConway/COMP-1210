   import java.util.Scanner;
   import java.util.Random;
	/**
	* Generates a username based off the user's
	* information such as their full name, and then
	* generates a random number for the ending.
	*
	* @author Walter Conway
	* @version 9/4/2012
	*/
   public class UsernameGenerator
   {
   
   /**
   * Receives the user's full name and generates a random number
   * to formulate a unique username and then displays it with the user's
	* password to the standard output.
	*
	*
   * @param args Command line arguments (not used)
   */
      public static void main(String[] args)
      {
         String firstName, middleName, lastName;
			String password, verifyPassword, username;
         int numberRandom;
         
      	// Generating a random number from 100 to 999.
      	Random generator = new Random();
      	numberRandom = generator.nextInt(900) + 100;
      
         Scanner userInput = new Scanner(System.in);
      	
      	
      	
         System.out.println("What is your first name:");
         firstName = userInput.nextLine();
         firstName = firstName.replace(" ", "z");
         if (firstName.isEmpty())
         {
            firstName = "z";
         }
         System.out.println("What is your middle name:");
         middleName = userInput.nextLine();
         middleName = middleName.replace(" ", "z");
         if (middleName.isEmpty())
         {
            middleName = "z";
         }
         System.out.println("What is your last name:");
         lastName = userInput.nextLine();
         lastName = lastName.replace(" ", "z");
         if (lastName.isEmpty())
         {
            lastName = "z";
         }
			if (lastName.length() == 1)
			{
			lastName = lastName + "z";
			}
         
      	// Generates a username.
      	username = firstName.substring(0, 1)
	+ middleName.substring(0, 1)
	+ lastName.substring(0, 1) 
	+ lastName.substring(lastName.length() - 1, lastName.length())
	+ numberRandom;
      	username = username.toLowerCase();
      	
      	// Compares the password against the retyped password.
         System.out.println("Enter a password you wish to have:");
         password = userInput.nextLine();
         System.out.println("Re-type the password for verification:");
         verifyPassword = userInput.nextLine();
         if (verifyPassword.compareTo(password) == 0)
         {
            System.out.println("\nWelcome " + firstName + " "
               + middleName + " "
               + lastName + "!");
               
         System.out.println("Your username is " + username);
         System.out.print("Your password is " + password); 
         
         	
         }
         else
         {
            System.out.print("\nFailed to set up the new "
               + "user's login information.");
         }
      
      }
   }