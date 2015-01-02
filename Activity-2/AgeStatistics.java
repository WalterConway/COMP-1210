   import java.util.Scanner;
   
	/**
	* Recieves input from the user and performs calculations
	* based off the user's input of their age, gender.
	*
	* @author Walter Conway
	* @version 8-26-2012
	*/
   public class AgeStatistics
   	{
   /**
   * Allows the user to input their name, age and gender which
   * an output of their age in minutes, centuries and max heart rate,
   * based off their gender and age, prints to standard output.
   *
   * @param args Command line arguments (not used)
   */
      public static void main(String[] args)
      {
         String name;
         int ageInYears;
         int gender = 0; // 1 for female
         double maxHeartRate = 0;
      
         Scanner userInput = new Scanner(System.in);
         System.out.print("Enter your name: ");
         name = userInput.nextLine();
      
         System.out.print("Enter your age in years: ");
         ageInYears = userInput.nextInt();
      
         System.out.print("Enter your gender (1 for female, 0 for male): ");
         gender = userInput.nextByte();
      
      // convert age into minutes
         System.out.println("\t Your age in minutes is "
         						+ ageInYears * 525600 + " minutes.");
      
      // convert into centuries
         System.out.println("\t Your age in centuries is "
         						+ (double) ageInYears / 100 + " centuries.");
      
      //display max heart rate
         System.out.print("Your max heart rate is ");
      
         if (gender == 1) { //calculate female MHR on next line
            maxHeartRate = 209 - (0.7 * ageInYears);
            System.out.println(maxHeartRate
            						 + " beats per minute.");
         }
         else { // calculate male MHR on next line
            maxHeartRate = 214 - (0.8 * ageInYears);
            System.out.println(maxHeartRate
            						+ " beats per minute.");
         }
      
      }
   }