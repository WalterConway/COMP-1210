   public class InventoryDriver
   {
   //String nameIn, double priceIn
      public static void main(String[] args)
      {
      InventoryItem it = new InventoryItem("Oil change", 39.99);
      it.setTaxRate(0.05);
      ElectronicsItem e = new ElectronicsItem("Cordless phone", 80.00, 1.8);
      OnlineArticle oa = new OnlineArticle("Java News", 8.50);
      oa.setWordCount(700);
      OnlineBook ob = new OnlineBook("Java for Noobs", 13.37);
      ob.setAuthor("L. G. Jones");
      System.out.println(it);
      System.out.println(e );
      System.out.println(oa );
      System.out.println(ob );
      
      
      
      }
   
   }