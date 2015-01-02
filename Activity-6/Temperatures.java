   import java.util.ArrayList;
   
   public class Temperatures
   {
      ArrayList<Integer> temperatures = new ArrayList<Integer>();
   
      
      public Temperatures(ArrayList<Integer> temperaturesIn)
      {
         temperatures = temperaturesIn;
      }
      public int getLowTemp()
      {
      int low;
         if(temperatures.isEmpty())
         {
            low = 0;
         }
         else
         {
         low = temperatures.get(0);
            for (int i = 0; i < temperatures.size(); i++)
            {
               if (temperatures.get(i) < low)
               {
                  low = temperatures.get(i);
                
               }
            }
         
         }
         return low;
      }
      public int getHighTemp()
      {
         int high;
         if(temperatures.isEmpty())
         {
            high = 0;
         }
         else
         {
            high = temperatures.get(0);
            for (Integer currentTemp : temperatures)
            {
               if (currentTemp > high)
               {
                  high = currentTemp;
               }
            }
         }
         return high;
      }
      public int lowerMinimum(int lowIn)
      {
         return lowIn < getLowTemp() ? lowIn : getLowTemp();
      }
      public int higherMaximum(int highIn)
      {
         return highIn > getHighTemp() ? highIn : getHighTemp();
      }
      public String toString()
      {
      
         return "Low: " + getLowTemp()
            + "\r\nHigh: " + getHighTemp();
      }
   }