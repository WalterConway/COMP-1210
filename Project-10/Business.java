  /**
  *   Holds the methods for the business class and the parent method of elite.
  *   @author Walter James Conway
  *   @version 11/1/2012
  */
   public class Business extends AirTicket
   {
      protected double foodAndBev;
      protected double entertainment;
      /**
      *  Constant for the award miles.
      */
      public static final double BIZ_AWD_MILES = 2.0;
   /**
   *  Constructor for Business.
   *  @param flightNum flight number.
   *  @param itineraryData gets the itinerary data.
   *  @param baseFareAmt   gets the amount for the base fare.
   *  @param fareAdjFactorAmt adjustment factor value.
   *  @param foodAndBevAmt sets the amount for food and beverages.
   *  @param entertainmentAmt sets the amount for the entertainment.
   */
      public Business(String flightNum, Itinerary itineraryData,
       double baseFareAmt, double fareAdjFactorAmt,
       double foodAndBevAmt, double entertainmentAmt)
      {
         super(flightNum, itineraryData, baseFareAmt, fareAdjFactorAmt);
         foodAndBev = foodAndBevAmt;
         entertainment = entertainmentAmt;
      }
   /**
   *  Gets the food and beverage amount.
   *  @return foodAndBev the amount from the foodAndBev variable.
   */
      public double getFoodAndBev()
      {
         return foodAndBev;
      }  
   /**
   *  Sets the amount in the food and beverage.
   *  @param foodAndBevAmt sets the variable foodAndBev.
   */
      public void setFoodAndBev(double foodAndBevAmt)
      {
         foodAndBev = foodAndBevAmt;
      }
   /**
   *  Returns the entertainment amount.
   *  @return entertainment gets the variable entertainment.
   */
      public double getEntertainment()
      {
         return entertainment;
      }
   /**
   *  Sets the variable entertainment.
   *  @param entertainmentAmt sets the variable entertainment.
   */
      public void setEntertainment(double entertainmentAmt)
      {
         entertainment = entertainmentAmt;
      }
   /**
   *  Returns an total fare value.
   *
   *  @return totalFare value.
   */
      public double totalFare()
      {
         return ((getBaseFare()) * (getFareAdjustmentFactor())
            + getFoodAndBev() + getEntertainment());
      }
   /**
   *  Returns the total awards miles the cust. has for the flight taken.
   *
   *  @return totalAwardMiles value.
   */
      public int totalAwardMiles()
      {
      
         return ((int) (getItinerary().getMiles() * BIZ_AWD_MILES));
      }
      /**
      *  Returns the specific information corresponding to the specific group.
      *  @return String of specific information.
      */
      public String toString()
      {
         String output;
         output = super.toString()
            +  "\n\t Includes Food/Beverage: " 
            + money.format(getFoodAndBev())
            + " Entertainment: " + money.format(getEntertainment());
      
         return output;
      }	
   
   }
