package _7kyu.brokenSequence;

import java.util.Arrays;
import java.util.Collections;

public class BrokenSequence {
   public int findMissingNumber(String sequence) {
      int missing = 0;
      char[] sequenceInIntArray;
      Collections.sort(Arrays.asList(sequence));
      try {
         if (sequence.length() == 0) {
            return 0;
         }
         int sequenceInInt = Integer.parseInt(sequence.replace(" ", ""));
         sequenceInIntArray = sequence.toCharArray();
      } catch (Exception e) {
         return 1;
      }
      if (sequence.charAt(sequence.length() - 1) == sequence.length()) {
         return 0;
      } else {
         for (int index = 1; index < sequenceInIntArray.length; index++) {
            int nextInt = Character.getNumericValue(sequenceInIntArray[index]);
            int currentInt = Character.getNumericValue(sequenceInIntArray[index - 1]);
            if ((nextInt - currentInt) > 1) {
               missing = nextInt - 1;
            }
         }
      }
      return missing;
   }
}
