   import java.util.Scanner;
   
	/**
	* Exchanges letters from a user's input and displays the input
	* according to the user's selection. 
	*
	* @author Walter Conway
	* @version 9/3/2012
	*/
   public class MessageConverter
   {
   /**
   * Allows the user to input a message than according to the user's
   * selection displays the message in the choice selected 
   * to the standard output.
   *
   * @param args Command line argument (not used)
   */
      public static void main(String[] args)
      {
      String message;
      String result = "";
      int outputType;
      Scanner userInput = new Scanner(System.in);
      
      System.out.print("Type in a message and press enter: \n\t> ");
      message = userInput.nextLine();
      System.out.print("\nOutput types:"
      	+ "\n\t1: As is"
      	+ "\n\t2: lower case"
      	+ "\n\t3: UPPER CASE"
      	+ "\n\t4: v_w_ls r_pl_c_d"
      	+ "\nEnter your choice: ");
      outputType = Integer.parseInt(userInput.nextLine());
      
      if (outputType == 1) { // as is
      result = message;
      }
      else if (outputType == 2) { // lower case
      result = message.toLowerCase();
      }
      else if (outputType == 3) { // upper case
      result = message.toUpperCase();
      }
      else if (outputType == 4) { // replace vowels
      result = message.toLowerCase();
      result = result.replace("a", "_");
      result = result.replace("e", "_");
      result = result.replace("i", "_");
      result = result.replace("o", "_");
      result = result.replace("u", "_");
      }
      else { // invalid input
      result = "Error: Invalid choice input.";
      }
      
      System.out.println("\n" + result);
      
      }
   }