   public class NumberOperations
   {
      int number;
      
   
      public NumberOperations(int numberIn)
      {
         number= numberIn;
      }
      
      public int getValue()
      {
      
         return number;
      
      }
      public String oddsUnder()
      {
      String output = "";
      int i = 0;
      while (i<number)
      {
      
      if( i % 2 !=0)
      {
      output += i + "\t";
      }
      
      i++;
      }
      
      
      
      
         return output;
      }
      public String powersTwoUnder()
      {
         return null;
      }
      public int isGreater(int compareNumber)
      {
         return 0;
      }
   
      public String toString()
      {
         return number + "";
      }
   
   
   
   }
