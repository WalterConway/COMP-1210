   public class Scores
   {
      int[] numbers;
   
      public Scores(int[] numbersIn)
      {
         numbers = numbersIn;
      }
      public int[] findEvens() {
         int numberEvens = 0;
      
         for (int i = 0; i < numbers.length; i++) {
            if( numbers[i] % 2 == 0){
               numberEvens++;
            }
         }
         int[] evens = new int[numberEvens];
      	
         int count = 0;
         for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0) {
               evens[count] = numbers[i];
               count++;
            }
         }
         return evens;
      }
   
      public int[] findOdds() {
      
         int numberOdds = 0;
      
         for (int i = 0; i < numbers.length; i++) {
            if( numbers[i] % 2 != 0){
               numberOdds++;
            }
         }
         int[] odds = new int[numberOdds];
      	
         int count = 0;
         for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 != 0) {
               odds[count] = numbers[i];
               count++;
            }
         }
         return odds;
      }
   
      public double calculateAverage()
      {
         int sum = 0;
         for (int i = 0; i < numbers.length; i++)
         {
            sum +=numbers[i];
         }
      return ((double)sum / numbers.length);
      }
   
      public String toReverseString()
      {
         String output = "";
         for(int i = numbers.length - 1; i != -1 ; i--)
         {
            output += numbers[i] + "\t";
         }
         return output;
      }
   
      public String toString()
      {
         String output = "";
      
         for (int i = 0; i < numbers.length; i++)
         {
            output += numbers[i] + "\t";
         }
      
         return output;
      }
   
   
   }