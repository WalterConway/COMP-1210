   public class ProfileInformation {
   // declare instance variables here
   // constructor
   // methods
   // toString method (for String output)
      private String firstName, lastName, location;
      private int age, status;
      private final int OFFLINE = 0, ONLINE = 1;
     
      public ProfileInformation(String first, String last){
         firstName = first;
         lastName = last;
         location = "Not specified";
         age = 0;
         status = OFFLINE;
      }
      //
      public void setLocation(String locationName){
         location = locationName;
      }
      //
      public int getAge() {
         return age;
      }
      //
      public String getLocation() {
         return location;
      }
      //
      public void logOff() {
         status = OFFLINE;
      }
      //
      public void logOn() {
         status = ONLINE;
      }
      
     //
      public boolean setAge(int ageInYears){
         boolean isSet = false;
         if(ageInYears > 0) {
            age = ageInYears;
            isSet= true;
         }
         return isSet;
      }
     
     //
      public String toString() {
         String output = "Name: " + firstName + " "
            + lastName + "\n";
         output += "Location: " + location + "\n";
         output += "Age: " + age + "\n";
         output += "Status: ";
         if(status == OFFLINE) {
            output += "Offline";
         }
         else{
            output += "Online";
         }
      	
         return output;
      }
     
   }