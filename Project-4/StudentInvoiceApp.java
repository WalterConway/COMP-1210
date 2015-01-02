   import java.util.Scanner;
   /**
	*	This is the driving program that uses the StudentInvoice class.
	*	
	*	@author Walter Conway
	*	@version 9/11/2012
	*/
   public class StudentInvoiceApp
   {
   /**
   *	Recieves the student's information(name, number, tuition, scholarships)
   *	and sends the information to the StudentInvoice class to be processed.
   *
   *	@param args Command line arguments not used
   */
      public static void main(String[] args)
      {
         String name, number;
         double tuitionFees, scholarships;
         Scanner userInput = new Scanner(System.in);
         System.out.print("What is the student's name: ");
         name = userInput.nextLine();		
         System.out.print("What is the student's ID number: ");
         number = userInput.nextLine();
         System.out.print("What is the total amount of tuition and fees: ");
         tuitionFees = userInput.nextDouble();
         System.out.print("What is the total amount of scholarships: ");
         scholarships = userInput.nextDouble();
         
      	StudentInvoice student1 = new
      	StudentInvoice(name, number, tuitionFees, scholarships);
      	
      	System.out.println("\n" + student1);
      }
   }