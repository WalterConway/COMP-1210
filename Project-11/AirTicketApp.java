   import java.util.Scanner;
   import java.io.IOException;
  /**
  *   AirTicketApp.class - The main driver program.
  *   
  *   @author Walter James Conway
  *   @version 11/17/2012
  */
   public class AirTicketApp
   {
   /**
   *  This is the main method for the driver program,
   *  outputs the file into 3 different ways.
   *  @param args Did nnot use a command line argument.
   */
      public static void main(String[] args)
      {
         boolean err = false;
         Scanner scan = new Scanner(System.in);
         AirTicketProcessor atp = new AirTicketProcessor();
         do {
            err = false;
            System.out.print("Enter File Name: ");
            try
            {
               atp.readAirTicketFile(scan.nextLine()); 
            }
               catch (IOException ioe)
               {
                  System.out.println("Enter the filename again.");
                  err = true;
               }
         } while(err);
         
      
         
         System.out.println("\n----------------------------");
         System.out.println("Air Ticket Report");
         System.out.println("----------------------------\n"); 
         atp.generateReport();
         for (AirTicket ticket : atp.getTickets())
         {
            System.out.println(ticket + "\n");
         }
         
         System.out.println("\n--------------------------------------");
         System.out.println("Air Ticket Report (by Flight Number)");
         System.out.println("--------------------------------------\n");
         atp.generateReportByFlightNum();
         for (AirTicket ticket : atp.getTickets())
         {
            System.out.println(ticket + "\n");
         }
         
         System.out.println("\n--------------------------------------");
         System.out.println("Air Ticket Report (by Itinerary)");
         System.out.println("--------------------------------------\n");
         atp.generateReportByItinerary();
         for (AirTicket ticket : atp.getTickets())
         {
            System.out.println(ticket + "\n");
         }
         
         
         System.out.println("\n--------------------------------------");
         System.out.println("Air Ticket Report for Invalid Input");
         System.out.println("--------------------------------------\n");
         atp.generateReportForInvalidInput();
         for (String invalidTicket : atp.getInvalidInput())
         {
            System.out.println(invalidTicket + "\n");
         }
      }
      
   
   }