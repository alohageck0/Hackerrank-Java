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

      }
   }
}
