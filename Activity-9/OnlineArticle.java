   public class OnlineArticle extends OnlineTextItem
   {
      private int wordCount;
   
   public OnlineArticle (String nameIn, double priceIn)
      {
         super (nameIn, priceIn);
         wordCount = 0;
      }
   
      public void setWordCount(int wordCountIn)
      {
         wordCount = wordCountIn;
      }
   	
   	
   }