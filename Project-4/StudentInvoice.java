   import java.text.NumberFormat;
/**
* This class calculates the student's information
* in regards to the student's student tuition
* and scholarship amount.
*
*/

   public class StudentInvoice
   {
      private String fullName, idNumber;
      private double tuitionAndFee, scholarshipAmt;
   	
   /**
   *	The constructor, used trim strings and set the tuition
   *	and scholarship amount in the class.
   *
   *	@param studentName captures student name
   *	@param studentNumber captures student number
   *	@param tuitionFees captures student tuition and fees
   *	@param scholarships captures student scholarship amount
   */
      public StudentInvoice(String studentName, String studentNumber,
      								 double tuitionFees, double scholarships)
      {
      	
         fullName = studentName.trim();
         idNumber = studentNumber.trim();
         tuitionAndFee = tuitionFees;
         scholarshipAmt = scholarships;
      }
   /**
   *	Recieves the name of the student.
   *
   *	@return fullName Returns student's name
   */
      public String getName()
      {
         return fullName;
      }
   /**
   *	Sets the student's name.
   *
   *	@return isSet returns false if studentName is null.
   *
   *	@param studentName captures the student's name
   */
      public boolean setName(String studentName)
      {
         boolean isNull = true;
         if (studentName == null)
         {
            isNull = false;
         }
         else
         {
            fullName = studentName.trim();
            
         }
         return isNull;
      }
   /**
   *	Returns student's number.
   *
   *	@return idNumber returns the student's number
   */
      public String getStudentNumber()
      {
         return idNumber;
      }
   /**
   *	Sets the student's number.
   *
   *	@return isSet returns false if student's number is null.
   *
   *	@param studentNumber captures the student's number.
   */
      public boolean setStudentNumber(String studentNumber)
      {
         boolean isNull = true;
         if (studentNumber == null)
         {
            isNull = false;
         }
         else
         {
            idNumber = studentNumber.trim();
            
         }
         return isNull;
      }
   /**
   *	Returns tuition and fees (one item).
   *
   *	@return tuitionAndFee returns the student's tuition and fee information
   */
      public double getTuitionFees()
      {
         return tuitionAndFee;
      }
   /**
   *	Sets tuition and fees (one item).
   *
   *	@param tuitionFees sets the students tution and fee
   *	information with the variable in this class.
   */
      public void setTuitionFees(double tuitionFees)
      {
         tuitionAndFee = tuitionFees;
      }
   /**
   *	Returns student's scholarship information.
   *
   *	@return scholarshipAmt returns the student's scholarship information
   */
      public double getScholarships()
      {
         return scholarshipAmt;
      }
   /**
   *	Sets student's scholarship information.
   *
   *	@param scholarships Sets student's scholarship information.
   */
      public void setScholarships(double scholarships)
      {
         scholarshipAmt = scholarships;
      }
   /**
   *	Modifies student's tuition and fees (one item).
   *
   *	@return returns the student's tuition and fee informaiton after
   *	making adjustments to the old amount.
   *
   *	@param tuitionFees captures the student's new amount.
   */
      public double adjustTuitionFees(double tuitionFees)
      {
         tuitionAndFee += tuitionFees;
         return tuitionAndFee;
      }
   /**
   *	Modifies student's scholarship information.
   *
   *	@return returns the student's scholarship information
   *	after adding to the old amount
   *
   *	@param scholarships captures the student's new information
   */
      public double adjustScholarships(double scholarships)
      {
         scholarshipAmt += scholarships;
         return scholarshipAmt;
      }
   /**
   *	The toString method.
   *	@return output returns all the student's information.
   */
   
      public String toString()
      {
         NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
         String output = "Name: " + fullName
            		 + "\nID Number: " + idNumber
            		 + "\nTuition & Fees: " + moneyFormat.format(tuitionAndFee)
            		 + "\nScholarships: " + moneyFormat.format(scholarshipAmt);
         if (tuitionAndFee < scholarshipAmt)
         {
            output += "\n\nPlease pick up your check for: "
               		 + moneyFormat.format((scholarshipAmt - tuitionAndFee)); 
         }
         else
         {
            output += "\n\nYou owe: "
               		 + moneyFormat.format((tuitionAndFee - scholarshipAmt));
         }
         return output;
      				 
      }
   
   
   
   }