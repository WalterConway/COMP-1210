  /**
  *   Holds the information for the economy class tickets.
  *   @author Walter James Conway
  *   @version 11/1/2012
  */
   public class Economy extends AirTicket
   {
      /**
      *  Constant for the award miles.
      */
      public static final double ECO_AWARD_MILES = 1.5;
   /**
   *  Constructor for Economy.
   *  @param flightNum flight number.
   *  @param itineraryData gets the itinerary data.
   *  @param baseFareAmt   gets the amount for the base fare.
   *  @param fareAdjFactorAmt adjustment factor value.
   */
      public Economy(String flightNum, Itinerary itineraryData,
       double baseFareAmt, double fareAdjFactorAmt)
      {
         super(flightNum, itineraryData, baseFareAmt, fareAdjFactorAmt);
      }
   
   /**
   *  Returns an total fare value.
   *
   *  @return totalFare value.
   */
      public double totalFare()
      {
         return ((getBaseFare()) * (getFareAdjustmentFactor()));
      }
   /**
   *  Returns the total awards miles the cust. has for the flight taken.
   *
   *  @return totalAwardMiles value.
   */
      public int totalAwardMiles()
      {
      
         return ((int) (getItinerary().getMiles() * ECO_AWARD_MILES));
      }
      /**
      *  Returns the specific information corresponding to the specific group.
      *  @return String of specific information.
      */
      public String toString()
      {
         String output;
         output = super.toString() 
         + "\n\t Includes Award Miles Factor: " + ECO_AWARD_MILES;
      
         return output;
      }	
   }