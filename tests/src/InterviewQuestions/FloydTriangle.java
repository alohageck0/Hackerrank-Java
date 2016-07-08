package InterviewQuestions;

public class FloydTriangle {
   public static void main(String[] args) {
      drawTriangle(18);
   }

   static void drawTriangle(int rows) {
      int temp = 0;
      for (int i = 1; i <= rows; i++) {
         for (int j = 0; j < i; j++) {
            System.out.print(++temp + " ");
         }
         System.out.println();
      }
   }
}
