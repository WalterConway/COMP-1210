   import java.util.ArrayList;
  /**
  *	StudentInvoiceList class accepts only StudentInvoice objects
  *	and performs caluclations to the list and outputs the results.
  *
  *	@author Walter Conway
  *	@version 9/28/2012
  */
   public class StudentInvoiceList
   {
   
      private ArrayList<StudentInvoice>
      	studentInfo = new ArrayList<StudentInvoice>();
   /**
   *	The contructor accepts a studentInvoice Object and sets the 
   *	object so it can be used in calculations.
   *
   *	@param studentObject Accepts a single ArrayList
   *		of object StudentInvoice.
   */
      public StudentInvoiceList(ArrayList<StudentInvoice> studentObject)
      {
         studentInfo = studentObject;
      
      }
   	/**
   	*	@return  A double representing the average of the non-zero 
   	*	tuition and fees fields of the StudentInvoice objects in the list.
   	*/
      public double avgTuitionFees()
      {
         double avg = 0;
         int divisor = 0;
         double sum = 0;
         if (!(studentInfo.isEmpty()))
         {
            int index = 0;
            
            while (index != studentInfo.size())
            {
               if (studentInfo.get(index).getTuitionFees() != 0)
               {
                  sum = sum + studentInfo.get(index).getTuitionFees();
                  ++divisor;
               }
            	
               index++;
            }
         avg = sum / divisor;
         }
        else
        {
        avg = 0;
        }
         
         return avg;
         
      }
   /**
   *	@return double that represents the percentage of students that have
   *	a scholarship that is greater than zero.
   */
      public double percentScholarships()
      {
         int index = 0;
         int countScholarships = 0;
         double percent = 0;
         
         if (studentInfo.isEmpty())
         {
            percent = 0;
         }
         else
         {
            while (index != studentInfo.size())
            {
               if (studentInfo.get(index).getScholarships() > 0)
               {
                  countScholarships++;
               }
               index++;
            }
         
            percent = ((double) countScholarships / studentInfo.size());
         }
         return percent;
      }
   	/**
   	*
   	*	@return  A double representing the average of the non-zero scholarship 
   	*		fields of the StudentInvoice objects in the list.
   	*/
      public double avgScholarships()
      {
         double avg = 0;
         int divisor = 0;
         double sum = 0;
         if (!(studentInfo.isEmpty()))
         {
            int index = 0;
            
            while (index != studentInfo.size())
            {
               if (studentInfo.get(index).getScholarships() != 0)
               {
                  sum = sum + studentInfo.get(index).getScholarships();
                  ++divisor;
               }
               index++;
            }
            avg = sum / divisor;
         }
         else
         {
            avg = 0;
         }
         return avg;
      }
   	/**
   	*	Goes through a loop process and creates an String output
   	*	that includes all objects in the list.
   	*
   	*	@return String that will list each object element in the ArrayList.
   	*/
      public String toString()
      {
         int index = 0;
         String outputFromList = "";
         while (index < studentInfo.size())
         {
            outputFromList += studentInfo.get(index) + "\n";
            index++;
         }
         
         return outputFromList;
      }
   }