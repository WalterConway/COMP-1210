   import java.text.DecimalFormat;
	/**
	*	This class represents a sport stacker.
	* 	The methods included: getName, getTimes, getNumTimesRecorded,
	*	toString, addTime, increaseSize, removeSlowestTime, findFastestTime
	*	computeAvgTime.
	*	@author Walter James Conway
	*	@version 10/11/2012
	*/
   public class SportStacker
   {
      private String nameOfPerson;
      private double[] timesArray;
      private int numberOfTimes;
      /**
   	*
   	*	@param name gets the name.
   	*	@param numOfTimes gets the length of the array being sent over.
   	*	@param times recieves the array from the driver program.
   	*/
      public SportStacker(String name, int numOfTimes, double ... times)
      {
         nameOfPerson = name;
         timesArray = times;
         numberOfTimes = numOfTimes;
      }
      /**
   	*
   	*	@return String that is the competitor's name.
   	*/
      public String getName()
      {	
         return nameOfPerson;
      }
      /**
   	*
   	*	@return double an array of times.
   	*/
      public double[] getTimes()
      {
      
         return timesArray;
      }
   	/**
   	*
   	*	@return int elements in the array
   	*/
      public int getNumTimesRecorded()
      {
         int count = 0;
         for (double arrayTime : timesArray)
         {
            if (arrayTime == 0)
            {
               count++;
            }
         }   
         numberOfTimes = (timesArray.length - count);
         return numberOfTimes;
      }
      /**
   	*
   	* @param newTime inputs a new time for the competitor.
   	*/
      public void addTime(double newTime)
      {
         int count = 0;
         for (double arrayTime : timesArray)
         {
            if (arrayTime == 0)
            {
               timesArray[count] = newTime;
               break;
            }
            else
            {
               count++; 
            }
            if ((count - 1) == timesArray.length - 1)
            {
               increaseSize();
               addTime(newTime);
            }
         }
      
      }
   	/**
   	*
   	* Increases the size of the array by one element.
   	*/
      public void increaseSize()
      {
         double[] tempArray = new double[(timesArray.length + 1)];
         int count = 0;
         for (double arrayTime : timesArray)
         {
            tempArray[count] = arrayTime;
            count++;
         }
         timesArray = tempArray;
      
      }
   	/**
   	*
   	* @return double removes the slowest time and
   	*	returns the slowest time which was removed.
   	*/
      public double removeSlowestTime()
      {
         double[] tempArray = new double[(timesArray.length)];
         double slowestTime = timesArray[0];
         int count = 0;
         for (double arrayTime : timesArray)
         {
            if (arrayTime > slowestTime)
            {
               slowestTime = arrayTime;
            }
         }
         for (double arrayTime : timesArray)
         {
            if (slowestTime != arrayTime)
                 
            {
               tempArray[count] = arrayTime;
               count++;
            }
         }
         
         timesArray = tempArray;
         return slowestTime;
      }
   	/**
   	*
   	* @return double finds the fastest time and returns the fastest time.
   	*/
      public double findFastestTime()
      {
         double fastestTime = timesArray[0];
         for (double arrayTime : timesArray)
         {
            if (arrayTime < fastestTime && arrayTime != 0)
            {
               fastestTime = arrayTime;
            }
         }
         return fastestTime;
      }
   	/**
   	*
   	*	@return double calculates the non-zero elements.
   	*/
      public double computeAvgTime()
      {
         DecimalFormat deci = new DecimalFormat("0.##");
         double sumOfTime = 0;
         int zeroElement = 0;
         double averageOfTimes = 0;
         if (timesArray.length != 0)
         {
            for (double arrayTime : timesArray)
            {
               if (arrayTime == 0)
               {
                  zeroElement++; // Calculates how many zeros are in the array.
               }
             /**	adds the zero arrays since adding zero doesn't
             *		affect the outcome of the average.
             */
               sumOfTime += arrayTime;
            }
            //Calculates the average of the non-zero elements.
            averageOfTimes += (sumOfTime / (timesArray.length - zeroElement)); 
         }
         return Double.parseDouble(deci.format(averageOfTimes));
      }
      /**
   	*
   	*	@return String which are name, times, and average of the competitor.
   	*/
      public String toString()
      {
         String output;
         output = "Sport Stacker Name: "
            + nameOfPerson
            + "\nTimes: ";
            
         for (double arrayTime : timesArray)
         {
            if (arrayTime != 0)
            {
               output += arrayTime + " ";
            }
         }   
            
         output += "\nAverage Time: "
            + computeAvgTime();
       
         return output;
      }
   	
   }