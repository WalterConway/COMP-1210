   public class Grade
   {
      private double exam1, exam2, finalExam;
      private double activityAvg, quizAvg, projectAvg;
      private String studentName;
      public static final int EXAM_1 = 0, EXAM_2 = 1, FINAL = 3;
      private static final double EXAM_WEIGHT = 0.15, ACT_WEIGHT = 0.1, QUIZ_WEIGHT = 0.1,
        FINAL_WEIGHT = 0.3, LAB_WEIGHT = 0.2, PROJ_WEIGHT = 0.2;
   
      public Grade(String nameIn)
      {
         studentName = nameIn;
      
      }
      public void setLabAverages(double activityAvgIn,
      		double quizAverageIn) {
      		
         activityAvg = activityAvgIn;
         quizAvg = quizAverageIn;
      		
      		
      }
   			
      public void setExamScore(int examType,
      		double examScore) {
         if (examType == EXAM_1){
            exam1 = examScore;
         }
         else if (examType == EXAM_2) {
            exam2 = examScore;
         }
         else if (examType == FINAL) {
            finalExam = examScore;
         }
      }
      public void setProjectAverage(double average)
      {
         projectAvg = average;
      }
      public double calculateGrade(){
         double grade = exam1 * EXAM_WEIGHT + exam2 * EXAM_WEIGHT + activityAvg * ACT_WEIGHT + quizAvg * QUIZ_WEIGHT
            + finalExam * FINAL_WEIGHT + projectAvg * PROJ_WEIGHT;
      	
         return grade;
      }
      public String toString() {
         return "Name: " + studentName + "\r\n"
            + "Final Grade: " + calculateGrade();
      
      
      
      }
   	
   	
   }