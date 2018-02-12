package _6kyu;


import org.testng.Assert;
import org.testng.annotations.Test;

public class UpDown {

   public static String arrange(String strng) {
      String[] arr = strng.split(" ");
      for (int i = 0; i < arr.length - 1; i++) {
         if (i % 2 == 0) {
            if (arr[i].length() > arr[i + 1].length()) {
               swapWords(arr, i);
            }
            arr[i] = arr[i].toLowerCase();
            if (i + 1 == arr.length - 1) arr[i + 1] = arr[i + 1].toUpperCase();
         } else {
            if (arr[i].length() < arr[i + 1].length()) {
               swapWords(arr, i);
            }
            arr[i] = arr[i].toUpperCase();
            if (i + 1 == arr.length - 1) arr[i + 1] = arr[i + 1].toLowerCase();
         }

      }

      return String.join(" ", arr);

   }

   private static void swapWords(String[] arr, int i) {
      String temp = arr[i + 1];
      arr[i + 1] = arr[i];
      arr[i] = temp;
   }

   @Test
   public void test() {
      System.out.println("Fixed Tests arrange");

      Assert.assertEquals(arrange("who hit retaining The That a we taken"),
              "who RETAINING hit THAT a THE we TAKEN"); // 3
      Assert.assertEquals(arrange("on I came up were so grandmothers"),
              "i CAME on WERE up GRANDMOTHERS so"); // 4
      Assert.assertEquals(arrange("way the my wall them him"),
              "way THE my WALL him THEM"); // 1
      Assert.assertEquals(arrange("turn know great-aunts aunt look A to back"),
              "turn GREAT-AUNTS know AUNT a LOOK to BACK"); // 2

   }
//   public static String arrange(String strng) {
//      List<String> linkedList = new LinkedList<>();
//      linkedList = Arrays.asList(strng.split(" "));
//      ListIterator<String> iterator = linkedList.listIterator();
//      String previous = null;
//      while (iterator.hasNext()) {
//         if (previous == null){
//            previous = iterator.next();
//            continue;
//         }
//         iterator.
//      }
//   }
}
