   public class OnlineBook extends OnlineTextItem
   {
      protected String author;
   
      public OnlineBook(String nameIn, double priceIn)
      {
         super (nameIn, priceIn);
         author = "Author Not Listed";
      
      }
   	
      public void setAuthor(String authorIn)
      {
         author = authorIn;
      }
   	
      public String toString()
      {
      
         return name + " - " + author + ": " + super.calculateCost();
      }
   
   }
