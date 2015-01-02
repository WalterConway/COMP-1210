  /**
  *   Holds the information for the nonrefundable tickets.
  *   @author Walter James Conway
  *   @version 11/1/2012
  */
   public class NonRefundable extends AirTicket
   {
   
      private double discountFactor;
   /**
   *  Constructor for NonRefundable.
   *  @param flightNum flight number.
   *  @param itineraryData gets the itinerary data.
   *  @param baseFareAmt   gets the amount for the base fare.
   *  @param fareAdjFactorAmt adjustment factor value.
   *  @param discountFactorAmt sets the discount factor amount for tickets.
   */
      public NonRefundable(String flightNum, Itinerary itineraryData,
       double baseFareAmt, double fareAdjFactorAmt, double discountFactorAmt)
      {
         super(flightNum, itineraryData, baseFareAmt, fareAdjFactorAmt);
         discountFactor = discountFactorAmt;
      }
   /**
   *  Returns the discount factor.
   *  @return discountFactor the variable that holds the discount factor.
   */
      public double getDiscountFactor()
      {
         return discountFactor;
      }
      /**
      *  Sets the discount factor variable.
      *  @param setDiscountFactor sets the variable discountFactor.
      */
      public void getDiscountFactor(double setDiscountFactor)
      {
        discountFactor = setDiscountFactor;
      }
   /**
   *  Returns an total fare value.
   *
   *  @return totalFare value.
   */
      public double totalFare()
      {
         return ((getBaseFare()) * (getFareAdjustmentFactor()
          * getDiscountFactor()));
      }
   /**
   *  Returns the total awards miles the cust. has for the flight taken.
   *
   *  @return totalAwardMiles value.
   */
      public int totalAwardMiles()
      {
      
         return getItinerary().getMiles();
      }
      /**
      *  Returns the specific information corresponding to the specific group.
      *  @return String of specific information.
      */
      public String toString()
      {
         String output = super.toString()
         + "\n\t Includes DiscountFactor: "
         + getDiscountFactor();
      
         return output;
      }	
   }