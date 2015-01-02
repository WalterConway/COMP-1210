   import java.util.Scanner;
   import java.util.ArrayList;
   import java.io.File;
   import java.io.IOException;
   import java.text.NumberFormat;

  /**
  *	The main driver program for the two classes StudentInvoice
  *	and StudentInvoiceList.
  *
  *	@author Walter Conway
  *	@version 9/27/2012
  */
   public class StudentInvoiceListApp 
   {
   /**
   *	@param args Command line arguments is not used.
   *	@throws IOException incase the user or the program fails.
   */
   
      public static void main(String[] args) throws IOException
      {
         String fileName;
      	
         ArrayList<StudentInvoice> inputList = new ArrayList<StudentInvoice>();
         StudentInvoiceList invoiceList;
         StudentInvoice studentInput;
         Scanner scan = new Scanner(System.in);
         Scanner fileScan;
      	
         System.out.print("Enter file name: ");
         fileName = scan.nextLine();
         fileScan = new Scanner(new File(fileName));
      	
      /**
      *	Checks to see if the file has a next line.
      *	Creates a new StudentInvoice object from the file.
      *	Adds the newly created invoice to a array list.
      */
         while (fileScan.hasNext())
         {
            studentInput = new StudentInvoice(fileScan.nextLine(),
               	fileScan.nextLine(),
               	Double.parseDouble(fileScan.nextLine()), 
               	Double.parseDouble(fileScan.nextLine()));
         			
            inputList.add(studentInput);
         }
      	
         invoiceList = new StudentInvoiceList(inputList);
         
         NumberFormat percentage = NumberFormat.getPercentInstance();
      //	Allows the percent to have two places pass the decimal and rounds up.
         percentage.setMaximumFractionDigits(2);
         percentage.setMinimumFractionDigits(2);
         
         NumberFormat usd = NumberFormat.getCurrencyInstance();
         System.out.println(invoiceList
            + "\nAverage Tuition and Fees: "
            + usd.format(invoiceList.avgTuitionFees())
            + "\nPercentage of Students with Scholarships: "
            + percentage.format(invoiceList.percentScholarships())
            + "\nAverage Scholarship: "
            + usd.format(invoiceList.avgScholarships()));
      }
   }
