   import java.util.ArrayList;
  /**
  *	StudentInvoiceList class accepts only StudentInvoice objects
  *	and performs caluclations to the list and outputs the results.
  *
  *	@author Walter Conway
  *	@version 10/06/2012
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
   *	Adds a student invoice to the ArrayList.
   *
   *	@param name used to set a local variable for student name.
   *	@param number used to set a local variable for student number.
   *	@param tuitionFees used to set a local variable for tuition and fees.
   *	@param scholarships used to set a local variable for finiancial aid.
   *
   */
      public void addStudentInvoice(String name, String number,
       double tuitionFees, double scholarships)
      {
         studentInfo.add(new StudentInvoice(name, number,
            tuitionFees, scholarships));
      }
   /**
   *	Used to remove a student from the ArrayList.
   *	@return boolean true or false based off if student is there or not.
   *	@param number used to set a local variable for student name.
   */
      public boolean deleteStudentInvoice(String number)
      {
         boolean isRemoved = false;
         for (StudentInvoice student : studentInfo)
         {
            if (student.getStudentNumber().compareTo(number) == 0)
            {
               studentInfo.remove(student);
               isRemoved = true;
               break;
            }
         }
         return isRemoved;
      }
   /**
   *	Sets the student's tuition and fees in the ArrayList.
   *	@return boolean based off if the student is found in the list.
   *	@param number used to set a local variable for student name.
   *	@param fees used to set a local variable for student's tuition and fees.
   */
      public boolean setStudentInvoiceTuitionFees(String number, double fees)
      {
         boolean isSet = false;
         for (StudentInvoice student : studentInfo)
         {
            if (student.getStudentNumber().compareTo(number) == 0)
            {
               student.setTuitionFees(fees);
               isSet = true;
               break;
            }
         }
         return isSet;
      }
   /**
   *	Retrieves the student's tuition and fees from the ArrayList.
   *	@return double based off the tuition and fees.
   *	@param number used to set a local variable for student's number.
   */
      public double getStudentInvoiceTuitionFees(String number)
      {
         double fees = -1;
         for (StudentInvoice student : studentInfo)
         {
            if (student.getStudentNumber().compareTo(number) == 0)
            {
               fees = student.getTuitionFees();
               break;
            }
         }
         return fees;
      }
   /**
   *	Used to set the scholarship amound in the ArrayList.
   *	@return true or false if the student is found and set.
   *	@param number sets a local variable for the student's number.
   *	@param financialAid sets a local variable for the scholarship amount.
   */
      public boolean setStudentInvoiceScholarships(String number,
       double financialAid)
      {
         boolean isSet = false;
         for (StudentInvoice student : studentInfo)
         {
            if (student.getStudentNumber().compareTo(number) == 0)
            {
               student.setScholarships(financialAid);
               isSet = true;
            }
         }
         return isSet;
      }
   /**
   *	Retrieves the student's scholarship amount from the ArrayList.
   *	@return double based off the scholarship amount.
   *	@param number sets a local variable for the student's number.
   */
      public double getStudentInvoiceScholarships(String number)
      {
         double financialAid = -1;
         for (StudentInvoice student : studentInfo)
         {
            if (student.getStudentNumber().compareTo(number) == 0)
            {
               financialAid = student.getScholarships();
               break;   
            }
         }  
         return financialAid;
      }
   /**
   *	Finds the student's invoice and prints it out.
   *	@return String returns the student's invoice.
   *	@param number sets a local variable for the student's number.
   */
      public String findStudentInvoice(String number)
      {
      
         String studentPresent = "";
         
         for (StudentInvoice student : studentInfo)
         {
            if (student.getStudentNumber().compareTo(number) == 0)
            {
               studentPresent = student.toString() + "\n";
               break;
            }
            else
            {
               studentPresent = number + " not found";
            }
         }
         return studentPresent;
      
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