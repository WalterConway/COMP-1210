   import java.util.ArrayList;
   import java.util.Scanner;
   
   
   public class TempertureInfo
   {
      public static void main(String[] args)
      {
         ArrayList<Integer> tempList = new ArrayList<Integer>();
         Scanner userInput = new Scanner(System.in);
           
         int tempInput = -1;
         do {
            System.out.print("Enter a postive temperature (-1 to stop): ");
            tempInput = userInput.nextInt();
            if (tempInput >-1)
            {
               tempList.add(tempInput);
            }
         } while (tempInput > -1);
         Temperatures temps = new Temperatures(tempList);
         System.out.println(temps);
      
      }
   
   }