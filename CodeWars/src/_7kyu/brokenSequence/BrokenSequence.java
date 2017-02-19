package _7kyu.brokenSequence;

import java.util.Arrays;
import java.util.Collections;

public class BrokenSequence {
   public int findMissingNumber(String sequence) {
      int missing = 0;
      try {
         if (sequence.length() == 0) {
            return 0;
         }
         int sequenceInInt = Integer.parseInt(sequence.replace(" ", ""));
      } catch (Exception e) {
         return 1;
      }
      String[] sequenceInIntArray = sequence.split(" ");
      Collections.sort(Arrays.asList(sequenceInIntArray));
      if (sequence.charAt(sequence.length() - 1) == sequence.length()) {
         return 0;
      } else {
         for (int index = 1; index < sequenceInIntArray.length; index++) {
            int nextInt = Integer.parseInt(sequenceInIntArray[index]);
            int currentInt = Integer.parseInt(sequenceInIntArray[index - 1]);
            if ((nextInt - currentInt) > 1) {
               missing = nextInt - 1;
               break;
            }
         }
      }
      return missing;
   }
}
