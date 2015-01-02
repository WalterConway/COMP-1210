   public class Customer implements Comparable<Customer>
   {
      String name;
      String location;
      double balance;
   
      public Customer(String nameIn)
      {
         name = nameIn;
         location = "";
         balance = 0;
      }
      
      public static void main(String[] args)
      {
         Customer cstmr1 = new Customer("John");
         cstmr1.changeBalance(10);
         cstmr1.setLocation("Boston, MA");
         System.out.println(cstmr1);
      
         Customer cstmr2 = new Customer("JoAnn");
         cstmr2.changeBalance(73);
         cstmr2.setLocation("Auburn, AL");
         System.out.println(cstmr2 + "\r\n");
      
         if (cstmr1.compareTo(cstmr2) == 1){
            System.out.println("Higher balance: " + cstmr1);
         }
         else if (cstmr1.compareTo(cstmr2) == -1 ) {
      	System.out.println("Higher balance: " + cstmr2);
      	}
      	else {
      	System.out.println("Balances are equal.");
      	}
      
      }
   
      public int compareTo(Customer obj) {
         
         if (this.balance > obj.getBalance()){
            return 1;
         }
         else if (this.balance < obj.getBalance()) {
            return -1;
         }
         else {
            return 0;
         }
      }
   
      public void setLocation(String locationIn)
      {
         location = locationIn;
      }
      public void setLocation(String city, String state)
      {
         location = city + ", " + state;
      }
      public void changeBalance(double amount)
      {
         balance += amount;
      }
      public String getLocation()
      {
         return location;
      }
      public double getBalance()
      {
         return balance;
      }
   
      public String toString()
      {
         String output = name + "\n" + getLocation()+ "\n" + "$" + getBalance()+ "\n";
      
         return output;
      }
   }