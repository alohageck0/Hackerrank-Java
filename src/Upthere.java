import org.testng.annotations.Test;

import java.util.ArrayList;

public class Upthere {

   public ArrayList<Object> getArray(ArrayList<Object> arr) {
      ArrayList<Object> result = new ArrayList<>();
      for (Object obj : arr) {
         try {
            char c = (Character) obj;
            if ((int) c > 65 && (int) c <= 90) {
               result.add(obj);
               continue;
            }
         } catch (Exception e) {

         }
         try {
            result.add((String.valueOf(obj)).toUpperCase());
         } catch (Exception e) {

         }
      }
      return result;
   }

   @Test
   public void testArray() {
      ArrayList<Object> arr = new ArrayList<>();
      arr.add('f');
      arr.add('0');
      arr.add('E');
      arr.add("sdfsf");
      ArrayList result = getArray(arr);
      System.out.println(result.toString());
   }
}

