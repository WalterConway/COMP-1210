   import java.util.Scanner;
	/**
	* Recieves input from the cater to calculate 
	* the number of tables and plates need for a event.
	*
	* @author Walter Conway
	* @version 8/26/2012
	*/
   public class TableOrder
   {
	/**
	* Allows the cater to enter the name of the event,
	* and total guest(s) that will attend and in return
	* the cater will recieve the total number of tables
	* and plates needed for the event to standard output.
	*
	*
	* @param args Command line arguments (not used)
	*/
      public static void main(String[] args)
      {
      String eventName;
      int totalGuests;
      
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the event's name: ");
      eventName = scan.nextLine();
      
      System.out.print("How many guest(s) are attending "
      						+ eventName + ": ");

      totalGuests = scan.nextInt();
       
      System.out.println("Tables for \"" + eventName + "\":");
   
		//Calculates the tables and plates needed and displays the results.
    	if (((double) totalGuests / 10) > (totalGuests / 10))
		{
		System.out.println("\tTables needed: " + ((totalGuests / 10) + 1));
		}
		else
		{
		System.out.println("\tTables needed: " + (totalGuests / 10));	
		}
		System.out.print("\tPlates needed: " + (totalGuests + 15));
     
      }
   }