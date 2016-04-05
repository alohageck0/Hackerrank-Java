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

         if (canNotMove(position, jumpNumber, arr)) {
            return false;
         }
         if (position >= arr.length) {
            return true;
         }
         if (canMove(position, jumpNumber, arr)) {
            if (position + jumpNumber >= arr.length || arr[position + jumpNumber] == 0) {
               position += jumpNumber;
            } else {
               position++;
            }
         } else {
            position--;
         }


      }
   }

   private static boolean canMove(int position, int jump, int[] arr) {
      if (arr[position + 1] == 0 || arr[position + jump] == 0 || position + 1 >= arr.length || position + jump >= arr.length) {
         return true;
      } else {
         return false;
      }
   }

   private static boolean canNotMove(int position, int jump, int[] arr) {
      if (!canMove(position, jump, arr)) {
         if (arr[position - 1] == 1 || position < 0 || position - 1 < 0 || arr[position - 1] == 1) {
            return true;
         }
      }
      return false;
   }
}
