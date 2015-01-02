import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
*	The driver program to give the user options to what
*	to do with the file opened.
*	@author Walter James Conway
*	@version 10/11/2012
*/
public class SportStackerApp
{
/**
*	@param args Command line argument used to get the file name from user.
*	@throws IOException in case file name is not right.
*/
   public static void main(String[] args) throws IOException
   {
      String fileName;
      char letterChoice;
      Scanner scan = new Scanner(System.in);
      Scanner fileScan;
      Scanner elementScan;
      SportStacker stackList;
      int numberOfElements;
      
      if (args.length == 0)
      {
         System.out.println("File name expected as a run argument.");
         System.out.println("Program ending.");
         return;
      }
      fileName = args[0];
      elementScan = new Scanner(new File(fileName));
      fileScan = new Scanner(new File(fileName));
      String competitorName;
      
   	//finding the elements
      int lineCount = 0;
      while (elementScan.hasNext())
      {
         elementScan.nextLine();
         lineCount++;
      }
      numberOfElements = lineCount;
      //--------------------
   	
      double[] fileList = new double[numberOfElements - 1];
      competitorName = fileScan.nextLine();
      int elementCount = 0;
      while (fileScan.hasNext())
      {
         fileList[elementCount] = Double.parseDouble(fileScan.nextLine());
         elementCount++;
      } 
      stackList = new SportStacker(competitorName, elementCount, fileList);
      System.out.println("File read in and SportStacker created.");
      System.out.println("Sport Stacker App Menu");
      System.out.println("P - Print Report");
      System.out.println("A - Add A new Time");
      System.out.println("D - Delete Worst Time");
      System.out.println("F - Find Fastest Time");
      System.out.println("Q - Quit"); 
      do
      {
         System.out.print("\nEnter Code [P, A, D, F, or Q]: ");
         letterChoice = scan.nextLine().toUpperCase().charAt(0);
         switch(letterChoice)
         {
            case 'P':
               System.out.println(stackList);
               break;
            case 'A':
               double newTime;
               System.out.print("Time To Add: ");
               newTime = Double.parseDouble(scan.nextLine());
               stackList.addTime(newTime);
               break;
            case 'D':
               System.out.println("Slowest Time Deleted: "
                  + stackList.removeSlowestTime());
               break;
            case 'F':
               System.out.println("Fastest Time: "
                  + stackList.findFastestTime());
               break;
            case 'Q':
               break;
            default:
         }
      } while (letterChoice != 'Q');
   }
}