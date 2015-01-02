   import java.util.Comparator;
  
  /**
  *   ItineraryCompare.class - defines how interary compare will be done.
  *   
  *   @author Walter James Conway
  *   @version 11/11/2012
  */
   public class ItineraryCompare implements Comparator<AirTicket>
   {
   /**
   *  This methods defines how the itinerary is going to be compared
   *  in this case it is done by the toString method.
   *  @param t1 ticket one
   *  @param t2 ticket two
   *  @return integer if equal or less than or equal to.
   */
      public int compare(AirTicket t1, AirTicket t2)
      {
         return (t1.getItinerary()).toString().
                     compareTo((t2.getItinerary()).toString());
      }
   }