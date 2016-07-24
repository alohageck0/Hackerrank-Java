package InterviewQuestions;

import java.util.Arrays;

public class Staircase {
   static void StairCase(int n) {
      char[] step = new char[n];
      for (int i = 0; i < n; i++) {
         step[i] = ' ';
      }
      for (int i = n - 1; i >= 0; i--) {
         step[i] = '#';
         System.out.println(step);
      }

   }

   static int sum(int[] numbers) {
      int sum = 0;
      for (int number : numbers) {
         sum += number;
      }
      return sum;

   }

   public static void main(String[] args) {
      StairCase(6);
   }


}
