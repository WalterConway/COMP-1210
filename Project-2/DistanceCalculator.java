   import java.util.Scanner;
	/**
	* Calculates the midpoint and slope of two points.
	*
	* @author Walter Conway
	* @version 8-27-2012
	*/
   public class DistanceCalculator
   {
   /**
   * Recieves two points x and y coordinates and returns
   * the user with the midpoint and slope of the recieved data.
   *
   * @param args Command line arguments (not used)
   */
      public static void main(String[] args)
      {
         int x1, x2, y1, y2;
         double slope;
      
         Scanner scan = new Scanner(System.in);
         System.out.println("What is the X and Y of the first point:");
         System.out.print("\t x1 = ");
         x1 = scan.nextInt();
         System.out.print("\t y1 = ");
         y1 = scan.nextInt();
         System.out.println("What is the X and Y of the second point:");
         System.out.print("\t x2 = ");
         x2 = scan.nextInt();
         System.out.print("\t y2 = ");
         y2 = scan.nextInt();
      
      //This prevents an error when the denominator of the slope equals zero.
         if (x1 == x2) {
            System.out.println("The slope is undefined");
         }
         else
         {
         //Calculates the slope and converts the intergers to doubles.
         slope = ((double) y2 - (double) y1) / ((double) x2 - (double) x1);
            System.out.println("The midpoint is ("
            						 + (((double) x1 + (double) x2) / 2)
            						+ ", " + (((double) y1 + (double) y2) / 2) + ")");
            System.out.println("The slope is " + slope);
         }
      }
   }