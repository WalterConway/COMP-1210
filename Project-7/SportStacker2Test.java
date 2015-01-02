   import org.junit.Assert;
   import org.junit.Test;

/**
*	Test the SportStacker2 class for bugs.
*	@author	Walter James Conway
*	@version 10/19/2012
*/
   public class SportStacker2Test {
   
   /**
   getName, getTimes, getNumTimesRecorded,
   toString, addTime, increaseSize, removeSlowestTime, findFastestTime
   computeAvgTime, computeMedianTime, findSlowestTime.
   */
   	/** Test for the return of the correct name.  **/
      @Test public void nameTest()
      {
         SportStacker2 s1 = new
            SportStacker2("Sami", 5, 4.5, 6.5, 6.0, 7.2, 6.3);
         Assert.assertEquals("Sami", s1.getName());
      }
      /** Test to see if the two arrays have the same values. **/
      @Test public void timesTest()
      {
         double[] testArray = {4.5, 6.5, 6.0, 7.2, 6.3};
         SportStacker2 s1 = new
            SportStacker2("Sami", 5, 4.5, 6.5, 6.0, 7.2, 6.3);
         Assert.assertEquals(java.util.Arrays.toString(testArray),
            java.util.Arrays.toString(s1.getTimes()));
      
      }
      /**  Test to see if the array length matches.**/
      @Test public void howManyInList()
      {
         SportStacker2 s1 = new
            SportStacker2("Sami", 5, 4.5, 6.5, 6.0, 7.2, 6.3);
         Assert.assertEquals(5, s1.getNumTimesRecorded());
      }
      /**  makes sure the toString method is correct.**/
      @Test public void toStringTest()
      {
         SportStacker2 s1 = new
            SportStacker2("Sami", 5, 4.5, 6.5, 6.0, 7.2, 6.3);
      	
         boolean out1 = s1.toString().contains("Sport Stacker Name: Sami");
         boolean out2 = s1.toString().contains("Times: 4.5 6.5 6.0 7.2 6.3");
         boolean out3 = s1.toString().contains("Average Time: 6.10");
         boolean out4 = s1.toString().contains("Median Time: 6.30");
         boolean out5 = s1.toString().contains("Fastest Time: 4.50");
         boolean out6 = s1.toString().contains("Slowest Time: 7.20");
         boolean out7 = s1.toString().contains("Player Count:");
         Assert.assertTrue(out1
            && out2 && out3 && out4 && out5 && out6 && out7);
      }
   
   	/** test to see if the array list increased by one element. **/
      @Test public void addATime()
      {
         SportStacker2 s1 = new
            SportStacker2("Sami", 5, 4.5, 6.5, 6.0, 7.2, 6.3);
         s1.addTime(5.9);
         Assert.assertEquals(6, s1.getNumTimesRecorded());
      }

   	/** Test to see if a empty element existed. **/
      @Test public void increaseTheSize()
      {
         SportStacker2 s1 = new
            SportStacker2("Sami", 1, 4.5);
         s1.increaseSize();
         boolean zeroElement = java.util.Arrays.toString(s1.getTimes())
            .contains("0.0");
         Assert.assertTrue(zeroElement);
      }
   
   	/**
   	*	checks to see if the result is correct
   	* 	and if the array contains the slowest time.
   	**/
      @Test public void removeTheSlowestTime()
      {
      
         SportStacker2 s1 = new
            SportStacker2("Sami", 5, 4.5, 6.5, 6.0, 7.2, 6.3);
         boolean check = (7.2 == s1.removeSlowestTime()
            && !(java.util.Arrays.toString(s1.getTimes()).contains("7.2")));	
         Assert.assertTrue(check);
      }
         	/**
   	*	checks to see if the result is correct
   	* 	and if the array contains the slowest time.
   	**/
      @Test public void removeTheSlowestTimeZero()
      {
      
         double[] timesInList = {};
         SportStacker2 s1 = new SportStacker2("Sami", 0, timesInList);
         boolean check = (0.0 == s1.removeSlowestTime()
            && !(java.util.Arrays.toString(s1.getTimes()).contains("0.0")));	
         Assert.assertTrue(check);
      }
   	
   	/** checks to see if the result is the fastest. **/
      @Test public void findTheFastestTime()
      {
         SportStacker2 s1 = new
            SportStacker2("Sami", 2, 0.0, 0.0, 6.0, 7.2, 0.0);
         boolean check = (6.0 == s1.findFastestTime());	
         Assert.assertTrue(check);
      }
      
   	   	/** checks to see if the result is Zero. **/
      @Test public void findTheFastestTimeZero()
      {
         double[] timesInList = {};
         SportStacker2 s1 = new SportStacker2("Sami", 0, timesInList);
         boolean check = (0.0 == s1.findFastestTime());	
         Assert.assertTrue(check);
      }
   
   	/** checks to see if the result is the slowest. **/
      @Test public void findTheSlowestTime()
      {
         SportStacker2 s1 = new
            SportStacker2("Sami", 5, 4.5, 6.5, 6.0, 7.2, 6.3);
         boolean check = (7.2 == s1.findSlowestTime());	
         Assert.assertTrue(check);
      }
         	/** checks to see if the result is the zero. **/
      @Test public void findTheSlowestTimeZero()
      {
         double[] timesInList = {};
         SportStacker2 s1 = new SportStacker2("Sami", 0, timesInList);
         boolean check = (0.0 == s1.findSlowestTime());	
         Assert.assertTrue(check);
      }
   	/** checks to see the average is correct. **/
      @Test public void computeTheAvgTime()
      {
         SportStacker2 s1 = new
            SportStacker2("Sami", 4, 4.5, 6.5, 6.0, 7.2, 0.0);
         
         Assert.assertEquals(6.05, s1.computeAvgTime(), 0.01);
      }
      
   	   	/** checks to see the average is correct. **/
      @Test public void computeTheAvgTimeZero()
      {
         double[] timesInList = {};
         SportStacker2 s1 = new SportStacker2("Sami", 0, timesInList);
         
         Assert.assertEquals(0.0, s1.computeAvgTime(), 0.01);
      }
      
   
   	
   	   	/** checks to see if the median is right for the zero list. **/
      @Test public void computeTheMedianTimeZero()
      {
         double[] timesInList = {};
         SportStacker2 s1 = new SportStacker2("Sami", 0, timesInList);
         
         Assert.assertEquals(0.0, s1.computeMedianTime(), 0.01);
      }
   	
   	/** checks to see if the median is right for the odd number. **/
      @Test public void computeTheMedianTimeOdd()
      {
         SportStacker2 s1 = new
            SportStacker2("Sami", 5, 4.5, 6.5, 6.0, 7.2, 6.3);
         
         Assert.assertEquals(6.30, s1.computeMedianTime(), 0.01);
      }
   	/** checks to see if the median is right for the even number. **/
      @Test public void computeTheMedianTimeEven()
      {
         SportStacker2 s1 = new
            SportStacker2("Sami", 6, 4.5, 6.5, 6.0, 7.2, 6.3, 2.2);
         
         Assert.assertEquals(6.15, s1.computeMedianTime(), 0.01);
      }
   
   	/** checks to see if the count is set to 0. **/
      @Test public void setCount()
      {
         SportStacker2 s1 = new SportStacker2("Sami", 5, 4.5, 6.5,
            6.0, 7.2, 6.3);
         s1.resetPlayerCount();
         Assert.assertEquals(0, s1.getPlayerCount());
      }
   	
   	/**
   	*	checks to see  if  the  count of how many sport 
   	*	stackers have been created is correct.
   	**/
      @Test public void getCount()
      {
         SportStacker2 s1 = new SportStacker2("Sami", 5, 4.5, 6.5,
            6.0, 7.2, 6.3);
         Assert.assertEquals(1, s1.getPlayerCount());
      }
   	
   }
