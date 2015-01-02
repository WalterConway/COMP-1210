
   public class BankLoan {
   	// constant fields
      private static final int MAX_LOAN_AMOUNT = 100000;
   
      // instance variables (can be used within the class)
      private String customerName;
      private double balance, interestRate;
      // static variables
      private static int loansCreated = 0;
   
      public BankLoan(String customer, double interest) {
         customerName = customer;
         interestRate = interest;
         balance = 0;
         loansCreated++;
      }
   
      public static int getLoansCreated()
      {
         return loansCreated;
      }
      public static void resetLoansCreated()
      {
      
         loansCreated = 0;
      }
   	
   	
      public boolean borrowFromBank(double amount) {
         
         boolean wasLoanMade = false;
         
         if (balance + amount < MAX_LOAN_AMOUNT) {
            wasLoanMade = true;
            balance += amount;
         }
      
         return wasLoanMade;
      }
   
      public double payBank(double amountPaid) {
         double newBalance = balance - amountPaid;
         if (newBalance < 0) {
            balance = 0;
            // paid too much, return the overcharge
            return Math.abs(newBalance);
         }
         else {
            balance = newBalance;
            return 0;
         }
      }
      
      public double getBalance() {
         return balance;
      }
      
      public boolean setInterestRate(double interestRateIn) {
      
         if (interestRateIn >= 0 && interestRateIn <= 1) {
            interestRate = interestRateIn;
            return true;
         }
         else {
            return false;
         }
      }
      
      public double getInterestRate() {
         return interestRate;
      }
      
      public void chargeInterest() {
         balance = balance * (1 + interestRate);
      }
      
      public static boolean isAmountValid(double amount)
      {
         return amount >= 0;
      }
   	
      public static boolean isInDebt(BankLoan loan)
      {
      
         if (loan.getBalance() > 0)
         {
            return true;
         }
      
         return false;
      }
   	
     // toString method
      public String toString() {
         String output = "Name: " + customerName + "\r\n" 
            + "Interest rate: " + interestRate + "%\r\n" 
            + "Balance: $" + balance + "\r\n";
         return output;
      }
   
   
   }
