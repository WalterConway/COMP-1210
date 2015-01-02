  /**
  *   Elite.class - a child of Business.class for the businessman.
  *   @author Walter James Conway
  *   @version 11/1/2012
  */
   public class Elite extends Business
   {
   
      private double communication;
   /**
   *  Constructor for Elite.
   *  @param flightNum flight number.
   *  @param itineraryData gets the itinerary data.
   *  @param baseFareAmt   gets the amount for the base fare.
   *  @param fareAdjFactorAmt adjustment factor value.
   *  @param foodAndBevAmt sets the amount for food and beverages.
   *  @param entertainmentAmt sets the amount for the entertainment.
   *  @param communicationAmt sets the value for the comm amount.
   */
      public Elite(String flightNum, Itinerary itineraryData,
       double baseFareAmt, double fareAdjFactorAmt, double foodAndBevAmt,
       double entertainmentAmt, double communicationAmt)
      {
         super(flightNum, itineraryData, baseFareAmt,
            fareAdjFactorAmt, foodAndBevAmt, entertainmentAmt);
         communication = communicationAmt;
      }
   /**
   *  Returns the amount in communication variable.
   *  @return communication the amount specified for communication.
   */
      public double getCommunication()
      {
         return communication;
      }
   /**
   *  Sets the the value for communication.
   *  @param communicationAmt sets the variable communication.
   */
      public void setCommunication(double communicationAmt)
      {
         communication = communicationAmt;
      }
   /**
   *  Returns an total fare value.
   *
   *  @return totalFare value.
   */
      public double totalFare()
      {
         return (super.totalFare() + getCommunication());
      }
   /**
   *  Returns the total awards miles the cust. has for the flight taken.
   *
   *  @return totalAwardMiles value.
   */
      public int totalAwardMiles()
      {
      
         return ((int) (getItinerary().getMiles() * super.BIZ_AWD_MILES));
      }
      /**
      *  Returns the specific information corresponding to the specific group.
      *  @return String of specific information.
      */
      public String toString()
      {
         String output = super.toString()
            + "\n\t Includes: Comm Services: "
            + money.format(getCommunication());
         return output;
      }
   
   }