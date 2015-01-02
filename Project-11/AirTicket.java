   import java.text.NumberFormat;
  /**
  *   AirTicket.class - Stores ticket data and provides methods to access
  *   the data.
  *   @author Walter James Conway
  *   @version 11/11/2012
  */
   public abstract class AirTicket implements Comparable<AirTicket>
   {
      protected String flightNumber;
      protected Itinerary tripData;
      protected double baseFare;
      protected double fareAdjFactor;
      protected NumberFormat money = NumberFormat.getCurrencyInstance();
   /**
   *  Constructor for AirTicket.
   *  @param flightNum flight number.
   *  @param itineraryData gets the itinerary data.
   *  @param baseFareAmt   gets the amount for the base fare.
   *  @param fareAdjFactorAmt adjustment factor value.
   */
      public AirTicket(String flightNum, Itinerary itineraryData,
       double baseFareAmt, double fareAdjFactorAmt)
      {
         flightNumber = flightNum;
         tripData = itineraryData;
         baseFare = baseFareAmt;
         fareAdjFactor = fareAdjFactorAmt;
      }
   /**
   *  Returns the variable rep flight number.
   *
   *  @return flightNumber returns a string rep the flight number
   */
      public String getFlightNum()
      {
         return flightNumber;
      }
   /**
   * Sets the value for the flight number.
   *
   * @param flightNum sets the value for the flight number
   */
      public void setFlightNum(String flightNum)
      {
         flightNumber = flightNum;
      }
   /**
   *  Returns the object or the toString method.
   *
   *  @return tripData returns the Itinerary
   */
      public Itinerary getItinerary()
      {
         return tripData;
      }
   /**
   *  Returns the base fare amount.
   *
   *  @return baseFare returns the base fare value.
   */
      public double getBaseFare()
      {
         return baseFare;
      }
   /**
   *  Sets the base fare amount.
   *
   *  @param baseFareAmt sets the baseFare variable.
   */
      public void setBaseFare(double baseFareAmt)
      {
         baseFare = baseFareAmt;
      }
   /**
   *  Gets the Fare Adjustment Factor value.
   *
   *  @return fareAdjFactor returns a double of the fare adjustment value.
   */
      public double getFareAdjustmentFactor()
      {
         return fareAdjFactor;
      }
      
      /**
      *  This method has to exist inorder to have the comparable interface.
      *  This also overrides the object compareable interface.
      *  @return integer based off if the flight
      *      number is less than the other or equal to.
      *  @param ticket retrieves a AirTicket as a parameter.
      */
      public int compareTo(AirTicket ticket)
      {
         return (flightNumber).compareTo(ticket.getFlightNum());
      }
      
   /**
   *  The overridding toString of object for no reason.
   *
   *  @return a null for no reason.
   */
      public String toString()
      {
      
         String output = "Flight: " + getFlightNum();
         output += "\n" + getItinerary() + " (" + totalAwardMiles()
            + " award miles)";
         output += "\n" + "Base Fare: " + money.format(getBaseFare())
            + " Fare Adjustment Factor: " + getFareAdjustmentFactor();
         output += "\n" + "Total Fare: "
            + money.format(totalFare()) + " ("
            + getClass() + ")";
         
         return output; 
      }
   /**
   *  Returns an total fare value.
   *
   *  @return totalFare value.
   */
      public abstract double totalFare();
   /**
   *  Returns the total awards miles the cust. has for the flight taken.
   *
   *  @return totalAwardMiles value.
   */
      public abstract int totalAwardMiles();
   
   }