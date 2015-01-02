   import java.util.Scanner;
   import java.util.ArrayList;
   import java.util.Collections;
   import java.io.File;
   import java.io.IOException;

  /**
  *   AirTicketProcessor.class - This reads in the file and does the sorting.
  *   
  *   @author Walter James Conway
  *   @version 11/17/2012
  */
   public class AirTicketProcessor
   {
      private ArrayList<AirTicket> airTickets = new ArrayList<AirTicket>();
      private ArrayList<AirTicket> airTicketsOriginal
              = new ArrayList<AirTicket>();
      private ArrayList<String> invalidRecords 
              = new ArrayList<String>(); // Will be used in Project 11.
   
   
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
         char category;
         Scanner fileScan = new Scanner(new File(fileName));
      
         while (fileScan.hasNext())
         {
            String line = fileScan.nextLine();
            Scanner lineScan = new Scanner(line).
                  useDelimiter(",");
            while (lineScan.hasNext())
            {
               String flightNum;
               Itinerary plan;
               AirTicket ticket;
               category = (lineScan.next()).charAt(0);
               try
               {
                  switch (category)
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
                        if (lineScan.hasNext())
                        {
                           lineScan.nextLine(); 
                        }
                        throw new InvalidCategoryException(Character.
                                          toString(category));  
                           
                  }
               }
               
                  catch (InvalidCategoryException e)
                  {
                     String  result = e + " in: " + line;
                     invalidRecords.add(result);
                  }
               
               
                  catch (NumberFormatException nfe)
                  {
                     if (lineScan.hasNext())
                     {
                        lineScan.nextLine(); 
                     }
                     String  result = nfe + " in: " + line;
                     invalidRecords.add(result);
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
      public ArrayList<AirTicket> getTickets()
      {
         return airTickets;
      }
      /**
      *  This returns the invalidRecords ArrayList to be used in the driver
      *  program.
      *  @return invalidRecords returns the ArrayList of invalid records.
      */
      public ArrayList<String> getInvalidInput()
      {
      
         return invalidRecords;
      }
      /**
      * This reverses the order and reverses it again to have the same
      *  order that it started with, which is kinda pointless, but this
      *  method is pointless for the reason that it is in the needed order
      *  from the start and the instructions does not say what order it should
      *  be in. I tried just sort but that did not place it in the needed order
      *  so I might have to ask a TA for help later.  
      */
      public void generateReportForInvalidInput()
      {
         Collections.reverse(invalidRecords);
         Collections.reverse(invalidRecords);
      }
      
      
     
      
      
   }