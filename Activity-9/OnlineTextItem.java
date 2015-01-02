   public abstract class OnlineTextItem extends InventoryItem
   {
      public OnlineTextItem(String nameIn, double priceIn)
      {
         super (nameIn, priceIn);
      }
   
      public double calculatCost()
      {
         return price;
      }
      
   	
   	
   }