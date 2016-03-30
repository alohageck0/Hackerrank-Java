package DequeueTest;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int subarrayLength = scanner.nextInt();
      Deque<Integer> deque = new LinkedList<>();

      for (int i = 0; i < n; i++) {
         deque.add(scanner.nextInt());
      }

   }
}
