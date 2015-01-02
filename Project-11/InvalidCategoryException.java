  /**
  *   InvalidCategoryException class - The invalid category exception
  *   that defines the invalid chars that were used in the switch case.
  *   
  *   @author Walter James Conway
  *   @version 11/17/2012
  */
  
   public class InvalidCategoryException extends Exception
   {
   /**
   * Defines what the invalid category exception is. 
   *
   *@param category which is the wrong char of line of the file.
   */
      public InvalidCategoryException(String  category)
      {
      
         super("For category: " + "\"" + category + "\"");
      }
   
   }