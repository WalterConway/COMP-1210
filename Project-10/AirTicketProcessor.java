   import java.util.Scanner;
   import java.util.ArrayList;
   import java.util.Collections;
   import java.io.File;
   import java.io.IOException;

  /**
  *   AirTicketProcessor.class - This reads in the file and does the sorting.
  *   
  *   @author Walter James Conway
  *   @version 11/11/2012
  */
   public class AirTicketProcessor
   {
      private ArrayList<AirTicket> airTickets = new ArrayList<AirTicket>();
      private ArrayList<AirTicket> airTicketsOriginal
              = new ArrayList<AirTicket>();
      private ArrayList<String> invalidRecords 
              = new ArrayList<String>(); // Will be used in Project 11.
   
   /**
   *  This is the contructor, but I have no idea
   *  how it will be used in this project.
   *  I will ask a TA when I get a chance.
   */
   
      public AirTicketProcessor()
      {
      }
   /**
   *  Reads in the file in a creats a ArrayList
   *  with elements that arrange based off the ticket.
   *  @throws IOException incase the file that was read in is 
   *  is not correct or missing... etc
   *  @param fileName holds the fileName so it can be used to
   *  read in the information from it.
   */
   
      public void readAirTicketFile(String fileName) throws IOException
      {
      
         Scanner fileScan = new Scanner(new File(fileName));
      
         while (fileScan.hasNext())
         {
            Scanner lineScan = new Scanner(fileScan.nextLine()).
                  useDelimiter(",");
            while (lineScan.hasNext())
            {
               String flightNum;
               Itinerary plan;
               AirTicket ticket;
               switch ((lineScan.next()).charAt(0))
               {
                  case 'B':
                     flightNum = lineScan.next();
                     plan = new Itinerary(lineScan.next(), lineScan.next(),
                               lineScan.next(),
                                 lineScan.next(),
                                    Integer.parseInt(lineScan.next()));
                                 
                     ticket = new Business(flightNum, plan,
                        Double.parseDouble(lineScan.next()), 
                           Double.parseDouble(lineScan.next()), 
                              Double.parseDouble(lineScan.next()), 
                                 Double.parseDouble(lineScan.next())); 
                                 
                  
                     airTickets.add(ticket);
                  
                     break;     
                  case 'E':
                     flightNum = lineScan.next();
                     plan = new Itinerary(lineScan.next(),
                            lineScan.next(),
                               lineScan.next(),
                                 lineScan.next(),
                                    Integer.parseInt(lineScan.next()));
                                    
                     ticket = new Economy(flightNum, plan,
                        Double.parseDouble(lineScan.next()),
                        Double.parseDouble(lineScan.next()));
                  
                     airTickets.add(ticket);
                     break;      
                  case 'F':
                     flightNum = lineScan.next();
                     plan = new Itinerary(lineScan.next(),
                            lineScan.next(),
                               lineScan.next(),
                                 lineScan.next(),
                                    Integer.parseInt(lineScan.next()));
                                    
                                    
                     ticket = new Elite(flightNum, plan,
                        Double.parseDouble(lineScan.next()), 
                           Double.parseDouble(lineScan.next()),
                              Double.parseDouble(lineScan.next()), 
                                 Double.parseDouble(lineScan.next()), 
                                    Double.parseDouble(lineScan.next())); 
                  
                     airTickets.add(ticket);
                     break;
                  case 'N':
                     flightNum = lineScan.next();
                     plan = new Itinerary(lineScan.next(),
                            lineScan.next(),
                               lineScan.next(),
                                 lineScan.next(),
                                    Integer.parseInt(lineScan.next()));
                                    
                     ticket = new NonRefundable(flightNum, plan,
                        Double.parseDouble(lineScan.next()), 
                           Double.parseDouble(lineScan.next()), 
                              Double.parseDouble(lineScan.next())); 
                              
                     airTickets.add(ticket);
                     break;
                  default:
               
               }
            }
         }
         for (AirTicket tickets : airTickets)
         {
            airTicketsOriginal.add(tickets);
         }
      }
      /**
      *  This method creates takes the cloned list
      *  and erases the tickets and then readds the 
      *  orginal elements to the list as they were when
      *  the file was read in.
      *
      */
      public void generateReport()
      {
         airTickets.clear();
         for (AirTicket tickets : airTicketsOriginal)
         {
            airTickets.add(tickets);
         }
      }
      /**
      *  This sorts the airTickets based off the 'natural order'
      *  that was defined in the comparable interface.
      */
      public void generateReportByFlightNum()
      {
         Collections.sort(airTickets);
      }
      /**
      *  This sorts the airTickets based off Itinerary which
      * was defined in the comparator interface.
      */
      public void generateReportByItinerary()
      {
      
         Collections.sort(airTickets, new ItineraryCompare());
      }
      /**
      *  This returns the airTicket ArrayList to be used in the driver
      *  program.
      *  @return AirTicket returns the ArrayList of AirTickets.
      */
      public ArrayList<AirTicket> getAirTickets()
      {
         return airTickets;
      }
      
   }