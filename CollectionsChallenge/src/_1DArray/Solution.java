package _1DArray;

import java.util.Scanner;

public class Solution {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int arraysNumber = in.nextInt();
      for (int i = 0; i < arraysNumber; i++) {
         int arrLength = in.nextInt();
         int jump = in.nextInt();

         int[] arr = new int[arrLength];
         for (int j = 0; j < arrLength; j++) {
            arr[j] = in.nextInt();
         }
         if (isPossible(arr, jump)) {
            System.out.println("YES");
         } else {
            System.out.println("NO");
         }
      }
   }

   private static boolean isPossible(int[] arr, int jumpNumber) {
      int position = 0;
      if (arr[1] == 1 && arr[jumpNumber] == 1) {
         return false;
      }
      while (true) {
         if (position >= arr.length) {
            return true;
         }
         if (position < 0) {
            return false;
         }
         if (arr[position + 1] == 1 && arr[position + jumpNumber] == 1) {
            position = arr[position - 1];
         } else if (arr[position + jumpNumber] == 0) {
            position += jumpNumber;
         } else {
            position++;
         }


      }
   }

   private static boolean canMove(int number) {
      if (number == 0) {
         return true;
      } else {
         return false;
      }
   }
}
