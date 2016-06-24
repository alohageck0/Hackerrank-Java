package InterviewQuestions;

import java.util.Arrays;

public class ProductOfInts {
   public static void main(String[] args) {

      int[] arr = {1, 2, 6, 5, 9};
      System.out.println(Arrays.toString(getProductsOfAllIntsExceptAtIndex(arr)));
      System.out.println(Arrays.toString(getProductsOfAllIntsExceptAtIndex1(arr)));
   }

   //brute force
   static int[] getProductsOfAllIntsExceptAtIndex(int[] arr) {
      long startTime = System.nanoTime();

      int[] arrProducts = new int[arr.length];
      for (int i = 0; i < arr.length; i++) {
         arrProducts[i] = 1;
         for (int j = 0; j < arr.length; j++) {
            if (i != j) {
               arrProducts[i] *= arr[j];
            }
         }
      }
      long stopTime = System.nanoTime();
      System.out.println(stopTime - startTime);
      return arrProducts;
   }

   //greddy
   static int[] getProductsOfAllIntsExceptAtIndex1(int[] arr) {
      long startTime = System.nanoTime();

      int[] arrProducts = new int[arr.length];
      int productBefore = 1;
      for (int i = 0; i < arr.length ; i++) {
         arrProducts[i] = productBefore;
         productBefore *= arr[i];
      }

      int productAfter = 1;
      for (int i = arr.length - 1; i >= 0; i--) {
         arrProducts[i] *= productAfter;
         productAfter *= arr[i];
      }
      long stopTime = System.nanoTime();
      System.out.println(stopTime - startTime);
      return arrProducts;

   }

}
