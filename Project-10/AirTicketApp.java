   import java.util.Scanner;
   import java.io.IOException;
  /**
  *   AirTicketApp.class - The main driver program.
  *   
  *   @author Walter James Conway
  *   @version 11/11/2012
  */
   public class AirTicketApp
   {
   /**
   *  This is the main method for the driver program,
   *  outputs the file into 3 different ways.
   *  @param args Did nnot use a command line argument.
   *  @throws IOException if the file is typed in wrong,
   *  or the file is not found.
   */
      public static void main(String[] args) throws IOException
      {
         Scanner scan = new Scanner(System.in);
         AirTicketProcessor atp = new AirTicketProcessor();
         System.out.print("Enter File Name: ");
         atp.readAirTicketFile(scan.nextLine());
         
         System.out.println("\n----------------------------");
         System.out.println("Air Ticket Report");
         System.out.println("----------------------------\n"); 
         atp.generateReport();
         for (AirTicket ticket : atp.getAirTickets())
         {
            System.out.println(ticket + "\n");
         }
         
         System.out.println("\n--------------------------------------");
         System.out.println("Air Ticket Report (by Flight Number)");
         System.out.println("--------------------------------------\n");
         atp.generateReportByFlightNum();
         for (AirTicket ticket : atp.getAirTickets())
         {
            System.out.println(ticket + "\n");
         }
         
         System.out.println("\n--------------------------------------");
         System.out.println("Air Ticket Report (by Itinerary)");
         System.out.println("--------------------------------------\n");
         atp.generateReportByItinerary();
         for (AirTicket ticket : atp.getAirTickets())
         {
            System.out.println(ticket + "\n");
         }
         
      }
      
   
   }