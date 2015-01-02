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
  *	@version 10/06/2012
  */
   public class StudentInvoiceListMenuApp 
   {
   /**
   *	@param args Command line arguments is not used.
   *	@throws IOException incase the user or the program fails.
   */
   
      public static void main(String[] args) throws IOException
      {
         String fileName;
         char optionSelected;
         ArrayList<StudentInvoice> inputList = new ArrayList<StudentInvoice>();
         StudentInvoiceList invoiceList = new StudentInvoiceList(inputList);
         StudentInvoice studentInput;
         Scanner scan = new Scanner(System.in);
         Scanner fileScan;
         System.out.println("StudentInvoice System Menu");
         System.out.println("R - Read in File");
         System.out.println("P - Print Report");
         System.out.println("A - Add An Invoice");
         System.out.println("D - Delete An Invoice");
         System.out.println("T - Set Tuition and Fees");
         System.out.println("S - Set Scholarships");
         System.out.println("F - Find An Invoice");
         System.out.println("Q - Quit");
         do
         {
            System.out.print("Enter Code [R, P, A, D, T, S, F, or Q]: ");
            optionSelected = scan.nextLine().toUpperCase().charAt(0);
            switch(optionSelected)
            {
               case 'R':
                  System.out.print("Enter file name: ");
                  fileName = scan.nextLine();
                  fileScan = new Scanner(new File(fileName));
               
                  while (fileScan.hasNext())
                  {
                     studentInput = new StudentInvoice(fileScan.nextLine(),
                        fileScan.nextLine(),
                        Double.parseDouble(fileScan.nextLine()), 
                        Double.parseDouble(fileScan.nextLine()));
                     inputList.add(studentInput);
                  }
                  System.out.println("file read in and"
                     + " student invoice list created");
                  break;
               case 'P':
                  for (StudentInvoice students : inputList)
                  {
                     System.out.println(students);
                  }
                  NumberFormat percentage = NumberFormat.getPercentInstance();
                  percentage.setMaximumFractionDigits(2);
                  percentage.setMinimumFractionDigits(2);
                  NumberFormat usd = NumberFormat.getCurrencyInstance();
                  System.out.println("\nAverage Tuition and Fees: "
                     + usd.format(invoiceList.avgTuitionFees())
                     + "\nPercentage of Students with Scholarships: "
                     + percentage.format(invoiceList.percentScholarships())
                     + "\nAverage Scholarship: "
                     + usd.format(invoiceList.avgScholarships())
                     + "\n");
                  break;
               case 'A':
                  String studentName, studentNumber;
                  double fees, aid;  
                  System.out.print("Name: ");
                  studentName = scan.nextLine();		
                  System.out.print("ID number: ");
                  studentNumber = scan.nextLine();
                  System.out.print("Tuition & Fees: ");
                  fees = Double.parseDouble(scan.nextLine());
                  System.out.print("Scholarships: ");
                  aid = Double.parseDouble(scan.nextLine());
                  invoiceList.addStudentInvoice(studentName,
                     	 studentNumber, fees, aid);
                  System.out.println("student added");
                  break;
               case 'D':
                  System.out.print("Delete Student with ID number: ");
                  studentNumber = scan.nextLine();
                  if (invoiceList.deleteStudentInvoice(studentNumber))
                  {
                     System.out.println(studentNumber + " deleted");
                  }
                  else
                  {
                     System.out.println(studentNumber + " not found");
                  }
                  break;
               case 'T':
                  usd = NumberFormat.getCurrencyInstance();
                  System.out.print("Set TuitionFees for Student"
                     + " with ID Number: ");
                  studentNumber = scan.nextLine();
                  System.out.print("Enter Tuition: ");
                  fees = Double.parseDouble(
                     scan.nextLine());
                  if (invoiceList.setStudentInvoiceTuitionFees(
                  studentNumber, fees))
                  {
                     System.out.println(studentNumber
                        + " Tuition and Fees: "
                         + usd.format(invoiceList.getStudentInvoiceTuitionFees(
                         	studentNumber)));
                  }
                  else
                  {
                     System.out.println(studentNumber + " not found");
                  }
                  break;
               case 'S':
                  usd = NumberFormat.getCurrencyInstance();
                  System.out.print("Set Scholarships "
                     + "for Student with ID Number: ");
                  studentNumber = scan.nextLine();
                  System.out.print("Enter Scholarships: ");
                  aid = Double.parseDouble(scan.nextLine());
                  if (invoiceList.setStudentInvoiceScholarships(
                  studentNumber, aid))
                  {
                     System.out.println(studentNumber + " Scholarships: "
                         + usd.format(invoiceList.getStudentInvoiceScholarships(
                         studentNumber)));
                  }
                  else
                  {
                     System.out.println(studentNumber + " not found");
                  }
                  break;
               case 'F':
                  System.out.print("Find Student with ID Number: ");
                  studentNumber = scan.nextLine();
                  System.out.println(invoiceList.findStudentInvoice(
                     studentNumber));
                  break;
               case 'Q':
                  break;
               default:
            }
         }
         while (optionSelected != 'Q');
      }
   }
