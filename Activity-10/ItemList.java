   import java.util.ArrayList;
 
   public class ItemList
   {
      private ArrayList <InventoryItem> inventory;
   
   
      public static void main(String arg[])
      {
         ItemList itemList = new ItemList();
         InventoryItem.setTaxRate(0.05);
         itemList.addItem(new ElectronicsItem("Laptop", 1234.56, 10));
         itemList.addItem(new InventoryItem("Motor Oil", 9.8));
         itemList.addItem(new OnlineBook("All Things Java", 12.3));
         itemList.addItem(new OnlineArticle("Off-Color Acronyms", 3.4));
         
         System.out.println(itemList);
         
      	System.out.println("Total Price: " + itemList.getTotalPrice(1.5) + "\r\n");
      
      }
   
   
      public ItemList()
      {
         inventory = new ArrayList<InventoryItem>();
      }
   
      public void addItem(InventoryItem itemIn)
      {
         inventory.add(itemIn);
      }
      public double getTotalPrice(double shipSurcharge)
      {
         double price = 0;
         for(InventoryItem item : inventory)
         {
            if(item instanceof ElectronicsItem)
            {
               price =+ ((ElectronicsItem)item).calculateCost() + shipSurcharge;
            }
            else
            {
            price +=item.calculateCost();
            }
         
         }
         return price;
      }
   
      public String toString()
      {
         String output = "All inventory:\r\n\r\n";
         
         for(InventoryItem item : inventory)
         {
            output += item + "\r\n";
         }
      
      
         return output;
      }
      
   
   
   }