  /**
  *   Holds the flight information of the customer.
  *   @author Walter James Conway
  *   @version 11/1/2012
  */
   public class Itinerary
   {
   
      private String fromAirport;
      private String depDateTime;
      private String toAirport;
      private String arrDateTime;
      private int miles;
   /**
   *  The constructor for the Itinerary class.
   *  @param departCode sets the depature code of the airport.
   *  @param arrivalCode sets the arrival code of the airport.
   *  @param depDayTime sets the depature time.
   *  @param arrDayTime sets the arrival Time.
   *  @param travelDist sets the distance needs to be covered.
   */
      public Itinerary(String departCode, String arrivalCode,
       String depDayTime, String arrDayTime, int travelDist)
      {
         fromAirport = departCode;
         depDateTime = depDayTime;
         toAirport = arrivalCode;
         arrDateTime = arrDayTime;
         miles = travelDist;
      
      }
   
   /**
   *  Returns the depature airport code.
   *  @return fromAirport the departure airport code.
   */
      public String getFromAirport()
      {
         return fromAirport;
      }
   /**
   *  Sets the depature airport code.
   *  @param departCode sets the fromAirport variable.
   */
      public void setFromAirport(String departCode)
      {
         fromAirport = departCode;
      }
   /**
   *  Return the depature time and date.
   *  @return depDateTime returns the depDateTime variable.
   */
      public String getDepDateTime()
      {
         return depDateTime;
      }
   /**
   *  Sets the depature date and time.
   *  @param depDayTime sets the depDateTime variable.
   */
      public void setDepDateTime(String depDayTime)
      {
         depDateTime = depDayTime;
      }
   /**
   *  Returns the arrival airport code.
   *  @return toAirport the arrival airport code.
   */
      public String getToAirport()
      {
         return toAirport;
      }
   /**
   *  Sets the arrival airport code.
   *  @param arrivalCode sets the arrival airport variable.
   */
      public void setToAirport(String arrivalCode)
      {
         toAirport = arrivalCode;
      }
      
   /**
   *  Returns the date and time of the arrival airport.
   *  @return arrDateTime variable the reps the arrival date and time.
   */ 
      public String getArrDateTime()
      {
         return arrDateTime;
      }
   /**
   *  Sets the arrival date and time to the airport.
   *  @param arrDayTime sets the variable arrDateTime.
   */
      public void setArrDateTime(String arrDayTime)
      {
         arrDateTime = arrDayTime;
      }
   /**
   *  Returns the milage.
   *  @return miles the variable of miles that will be covered.
   */
      public int getMiles()
      {
         return miles;
      }
   /**
   *  Sets the distance that will be traveled.
   *  @param travelDist sets the miles variable.
   */
      public void setMiles(int travelDist)
      {
         miles = travelDist;
      }
   	
      /**
      *  Returns the specific information about the flight information.
      *  @return String of specific information.
      */
      public String toString()
      {
      
         return getFromAirport() + "-" + getToAirport()
            + " (" + getDepDateTime() + " - "
            + getArrDateTime() + ") " + getMiles() + " miles";
      }
      
   }