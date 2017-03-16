package DateProblem;

public class Solution {

   public static SimpleDate getNextQuarter(SimpleDate date) {



      if (date.getMonth() < 4) {
         return new SimpleDate(date.getYear(), 4, 1);
      } else if (date.getMonth() < 7) {
         return new SimpleDate(date.getYear(), 7, 1);
      } else if (date.getMonth() < 10) {
         return new SimpleDate(date.getYear(), 10, 1);
      } else {
         return new SimpleDate(date.getYear() + 1, 1, 1);
      }
   }
}

