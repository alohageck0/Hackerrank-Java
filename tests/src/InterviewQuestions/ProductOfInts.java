package InterviewQuestions;

import java.util.Arrays;

public class ProductOfInts {
   public static void main(String[] args) {

      int[] arr = {1, 2, 3, 4, 5};
      System.out.println(Arrays.toString(getProductsOfAllIntsExceptAtIndex(arr)));
   }

   static int[] getProductsOfAllIntsExceptAtIndex(int[] arr) {
      int[] arrProducts = new int[arr.length];
      for (int i = 0; i < arr.length; i++) {
         arrProducts[i] = 1;
         for (int j = 0; j < arr.length; j++) {
            if (i != j) {
               arrProducts[i] *= arr[j];
            }
         }
      }
      return arrProducts;
   }
}
