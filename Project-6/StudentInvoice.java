   import java.text.NumberFormat;
   /**
   *	The studentInvoice recieves the student's name, number,
	*	and tuition & fees and scholarship amount from the user.
   *
   *	@author Walter Conway
   *	@version 9/24/2012
   */
   
   public class StudentInvoice
   {
      private String name, number;
      private double fees, financialAid;
      /**
   	*	Contructor, sets variables only if the parameters
   	*	for the name, and number are not null and there 
   	*	is a string present besides a space.
   	*
   	*	@param studentName recieves the Student's name.
   	*	@param studentNumber recieves the Student's number.
   	*	@param tuitionFees recieves the Fees and tuition amount.
   	*	@param scholarships recieves the scholarship amount.
   	*/
      public StudentInvoice(String studentName, String studentNumber,
      	double tuitionFees, double scholarships)
      {
         if (studentName != null && !studentName.trim().isEmpty())
         {
            name = studentName;
         }
         if (studentNumber != null && !studentNumber.trim().isEmpty())
         {
            number = studentNumber;
         }
      
         fees = tuitionFees;
         financialAid = scholarships;
      
      }
   	/**
   	*	Description.
   	*
   	*	@return String retrieves the Student's name. 
   	*
   	*/
      public String getName()
      {
         return name;
      }
   	/**
   	*
   	*	@return boolean returns a true or false value depending on
   	*	the parameter of studentName.
   	*
   	*	@param studentName recieves the student's name.
   	*/
      public boolean setName(String studentName)
      {
         boolean isSet = true;
         if (studentName == null || studentName.isEmpty())
         {
            isSet = false;
         }
         else
         {
            name = studentName.trim();
         }
         return isSet;
      }
   	/**
   	*	
   	*
   	*	@return String based on the student's number.
   	*/
      public String getStudentNumber()
      {
         return number;
      }
   	/**
   	*
   	*	@return boolean returns true or false based of the student's number.
   	*	@param studentNumber retrieves the student's number.
   	*/
      public boolean setStudentNumber(String studentNumber)
      {
         boolean isSet = true;
         if (studentNumber == null || studentNumber.isEmpty())
         {
            isSet = false;
         }
         else
         {
            number = studentNumber.trim();
         }
         return isSet;
      }
   	/**
   	*	Description.
   	*
   	*	@return double based off the student's fees and tuition amount.
   	*
   	*/
      public double getTuitionFees()
      {
         return fees;
      }
   	/**
   	*	Description.
   	*
   	*	@return boolean returns a true or false based 
   	*	of the student's tuition and fees.
   	*	@param tuitionFees retrieves the student's tuition and fee amount.
   	*/
      public boolean setTuitionFees(double tuitionFees)
      {
         boolean isSet = true;
         if (!(tuitionFees >= 0))
         {
            isSet = false;
         }
         else
      	{
         fees = tuitionFees;
        } 
         return isSet;
      }
   	/**
   	*	Description.
   	*
   	*	@return double of the student's financial Aid amount
   	*/
      public double getScholarships()
      {
         return financialAid;
      }
   	/**
   	*	Description.
   	*
   	*	@return boolean true or false based on the parameter scholarships
   	*	@param scholarships retrieves the student's scholarship amount.
   	*/
      public boolean setScholarships(double scholarships)
      {
         boolean isSet = true;
         if (!(scholarships >= 0))
         {
            isSet = false;
         }
         else
      	{
         financialAid = scholarships;
         }
         return isSet;
      }
   	/**
   	*	Description.
   	*
   	*	@return double based off the student's fees
   	*	@param tuitionFees retrieves the student's tuition and fee amount.
   	*/
      public double adjustTuitionFees(double tuitionFees)
      {
         if ((fees + tuitionFees) >= 0)
         {
            fees += tuitionFees;
         }
         return fees;
      }
      /**
   	*	Description.
   	*	@return double of the financialAid amount.
   	*	@param scholarships retrieves the studnet's scholarship amount.
   	*/
      public double adjustScholarships(double scholarships)
      {
         if ((financialAid + scholarships) >= 0)
         {
            financialAid += scholarships;
         }
         return financialAid;
      }
      /**
   	*	Description.
   	*	@return String returns the student's information 
   	*	and account information.
   	*/
      public String toString()
      {
         NumberFormat usd = NumberFormat.getCurrencyInstance();
      
         String output = "\nName: " + name
            + "\nID Number: " + number
            + "\nTuition & Fees: " + usd.format(fees)
            + "\nScholarships: " + usd.format(financialAid);
         if (financialAid > fees)
         {
            output += "\nPlease pick up your check for: "
               	+ usd.format(financialAid - fees);
         }
         else
         {
            output += "\nYou owe: " + usd.format(fees - financialAid);
         }
      	
         return output;
      }
   
   
   }