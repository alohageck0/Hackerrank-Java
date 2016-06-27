package InterviewQuestions;

import java.util.HashMap;

public class FindRepeatedNumber {

   static int getRepeatedNumber(int[] intArray) {
      HashMap<Integer, Integer> numbers = new HashMap<>();
      int repeatedNUmber = 0;
      for (int i = 0; i < intArray.length; i++) {
         if (!numbers.containsKey(intArray[i])) {
            numbers.put(intArray[i], 1);
         } else {
            repeatedNUmber = intArray[i];
            return repeatedNUmber;
         }
      }
      return -1;
   }
}
