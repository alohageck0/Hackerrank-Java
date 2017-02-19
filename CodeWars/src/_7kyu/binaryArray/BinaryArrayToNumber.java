package _7kyu.binaryArray;

import java.util.List;

public class BinaryArrayToNumber {

   public static int ConvertBinaryArrayToInt(List<Integer> binary) {
      if (binary.size() == 0) {
         return 0;
      }
      int result = 0;
      int power = 0;
      for (int index = binary.size() - 1; index >= 0; index--) {
         if (binary.get(index) == 1) {
            result += Math.pow(2, power);
         }
         power++;
      }
      return result;
   }
}
