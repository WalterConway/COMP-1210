   import java.util.Scanner;
   public class Activity4A
   {
      public static void main(String[] args)
      {
         Scanner userInput = new Scanner(System.in);
         ProfileInformation user1, user2, user3, user4;
         int age, whooption, whatoption, activity;
         String location;
         whooption = 0;
         whatoption = 0;
         activity = 0;
         
         user1 = new ProfileInformation("John", "Buck");
         user2 = new ProfileInformation("Jane", "Doe");
         user3 = new ProfileInformation("Bill", "Raines");
         user4 = new ProfileInformation("Sarah", "Hall");
      
         System.out.println("====================================");
         System.out.println("Who are you?");
         System.out.println("1) "+ user1 + "\n\n2) " + user2 
            + "\n\n3) " + user3 + "\n\n4) " +user4);
         System.out.println("====================================");
      // asking for input for who the user might be
         whooption = userInput.nextInt();
      
         if (whooption == 1)
         {
         
            System.out.println("====================================");
            System.out.println("What would you like to Update?");
            System.out.println("1) Age \n 2) Location \n 3) Status");
            System.out.println("Update Number? ");
            whatoption = userInput.nextInt();
            if (whatoption == 1)
            {
               System.out.print("Age will be? ");
               age = userInput.nextInt();
               user1.setAge(age);
               System.out.println(user1);
            }
            else if (whatoption == 2)
            {
               System.out.print("Location will be? ");
               location = userInput.next();
               user1.setLocation(location);
               System.out.println(user1);
            }
            else if (whatoption == 3)
            {
            System.out.println("Status will be?\n 1)online \n 2)offline");
            activity = userInput.nextInt();
            if (activity == 1)
            {
            user1.logOn();
            }
            else if (activity == 2)
            {
            user1.logOff();
            }
            System.out.println(user1);
            }
            System.out.println("====================================");
         
         }
         else if (whooption == 2)
         {
         
            System.out.println("====================================");
            System.out.println("What would you like to Update?");
            System.out.println("1) Age \n 2) Location \n 3) Status");
            System.out.println("Update Number? ");
            whatoption = userInput.nextInt();
            if (whatoption == 1)
            {
               System.out.print("Age will be? ");
               age = userInput.nextInt();
               user2.setAge(age);
               System.out.println(user2);
            }
            else if (whatoption == 2)
            {
               System.out.print("Location will be? ");
               location = userInput.next();
            
               user2.setLocation(location);
               System.out.println(user2);
            }
            else if (whatoption == 3)
            {
            System.out.println("Status will be?\n 1)online \n 2)offline");
            activity = userInput.nextInt();
            if (activity == 1)
            {
            user2.logOn();
            }
            else if (activity == 2)
            {
            user2.logOff();
            }
            System.out.println(user2);
            }
            System.out.println("====================================");
         
         
         }
         else if (whooption == 3)
         {
          System.out.println("====================================");
            System.out.println("What would you like to Update?");
            System.out.println("1) Age \n 2) Location \n 3) Status");
            System.out.println("Update Number? ");
            whatoption = userInput.nextInt();
            if (whatoption == 1)
            {
            System.out.print("Age will be? ");
            age = userInput.nextInt();
            user3.setAge(age);
            System.out.println(user3);
            }
            else if (whatoption == 2)
            {
            System.out.print("Location will be? ");
            location = userInput.next();
            
            user3.setLocation(location);
            System.out.println(user3);
            }
            else if (whatoption == 3)
            {
            System.out.println("Status will be?\n 1)online \n 2)offline");
            activity = userInput.nextInt();
            if (activity == 1)
            {
            user3.logOn();
            }
            else if (activity == 2)
            {
            user3.logOff();
            }
            System.out.println(user3);
            }
            System.out.println("====================================");
         }
         else if (whooption == 4)
         {
          System.out.println("====================================");
            System.out.println("What would you like to Update?");
            System.out.println("1) Age \n 2) Location \n 3) Status");
            System.out.println("Update Number? ");
            whatoption = userInput.nextInt();
            if (whatoption == 1)
            {
            System.out.print("Age will be? ");
            age = userInput.nextInt();
            user4.setAge(age);
            System.out.println(user4);
            }
            else if (whatoption == 2)
            {
            System.out.print("Location will be? ");///
            location = userInput.next();
            
            user4.setLocation(location);
            System.out.println(user4);
            }
            else if (whatoption == 3)
            {
            System.out.println("Status will be?\n 1)online \n 2)offline");
            activity = userInput.nextInt();
            if (activity == 1)
            {
            user4.logOn();
            }
            else if (activity == 2)
            {
            user4.logOff();
            }
            System.out.println(user4);
            }
            System.out.println("====================================");
         }
      
      
      
      
      
      
      
      
      }
   }