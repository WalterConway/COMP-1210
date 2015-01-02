   public class ElectronicsItem extends InventoryItem
   {
      protected double weight;
      private static final double SHIPPING_COST = 1.5;
   
      public ElectronicsItem (String nameIn, double priceIn, double weightIn)
      {
         super(nameIn, priceIn);
         weight = weightIn;
      
      }
   
      public double calculateCost()
      {
         return super.calculateCost() + (SHIPPING_COST * weight);
      }
   
   }