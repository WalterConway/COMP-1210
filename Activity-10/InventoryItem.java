   public class InventoryItem
   {
      protected double price;
      protected String name;
      private static double taxRate = 0;
   
   public InventoryItem(String nameIn, double priceIn)
   {
   name = nameIn;
   price = priceIn;
   }
   
   public double calculateCost()
   {
   return price * (1 + taxRate);
   }
   public static void setTaxRate(double taxRateIn)
   {
   taxRate = taxRateIn;
   }
   
   public String toString()
   {
   return name + ": $" + calculateCost();
   }
   
   
   }