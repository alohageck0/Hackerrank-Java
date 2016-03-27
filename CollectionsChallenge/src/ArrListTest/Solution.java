package ArrListTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      ArrayList<int[]> arrayList = new ArrayList<>();
      int n = scanner.nextInt();
      for (int i = 0; i < n; i++) {
         int d = scanner.nextInt();
         int[] arr = new int[d];
         for (int j = 0; j < d; j++) {
            arr[j] = scanner.nextInt();
         }
         arrayList.add(arr);
      }
      int q = scanner.nextInt();
      for (int i = 0; i < q; i++) {
         int x = scanner.nextInt();
         int y = scanner.nextInt();
         int[] line = arrayList.get(x-1);

         try {
            System.out.println(line[y-1]);
         } catch (Exception e) {
            System.out.println("ERROR!");
         }
      }
   }
}
