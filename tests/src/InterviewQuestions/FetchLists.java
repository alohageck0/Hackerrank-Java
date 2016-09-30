package InterviewQuestions;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FetchLists {

   @Test
   public void test() {
      Integer[] one = {1, 2, 6, 8, 15, 70};
      Integer[] two = {4};

      printResult(fetch(one, two, 44));
   }

   public ArrayList<Integer> fetch(Integer[] firstList, Integer[] secondList, int max) {

      List<Integer> first = new LinkedList<>(Arrays.asList(firstList));
      List<Integer> second = new LinkedList<>(Arrays.asList(secondList));
      ArrayList<Integer> result = new ArrayList<>(max);
      if (max > firstList.length + secondList.length) {
         max = firstList.length + secondList.length;
      }
      for (int i = 0; i < max; i++) {
         if (first.size() == 0) {
            result.add(second.get(0));
            second.remove(0);
            continue;
         }
         if (second.size() == 0) {
            result.add(first.get(0));
            first.remove(0);
            continue;
         }

         if (first.get(0) < second.get(0)) {
            result.add(first.get(0));
            first.remove(0);
         } else if (first.get(0) > second.get(0)) {
            result.add(second.get(0));
            second.remove(0);
         } else {
            result.add(first.get(0));
            first.remove(0);
            second.remove(0);
            i++;
         }
      }

      return result;
   }

   public void printResult(ArrayList<Integer> result) {
      for (int i : result) {
         System.out.print(i + " ");
      }
   }

}
