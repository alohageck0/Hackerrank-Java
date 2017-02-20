package _7kyu.brokenSequence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class BrokenSequence {
   public int findMissingNumber(String sequence) {
      int missing = 0;
      if (sequence.length() == 0) {
         return 0;
      }
      String[] sequenceInIntArray = sequence.split(" ");
      List<Integer> listSequence = new ArrayList<>();
      for (String s : sequenceInIntArray) {
         try {
            listSequence.add(Integer.parseInt(s));
         } catch (Exception e) {
            return 1;
         }
      }
      Collections.sort(listSequence);
      if (listSequence.get(0) != 1) {
         return 1;
      }
      for (int index = 1; index < listSequence.size(); index++) {
         int nextInt = listSequence.get(index);
         int currentInt = listSequence.get(index - 1);
         if ((nextInt - currentInt) > 1) {
            missing = currentInt + 1;
            break;
         }
      }
      return missing;
   }
}
