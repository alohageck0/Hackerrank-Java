import java.util.*;
import java.util.regex.*;

class PhoneDir {

   public static  String phone(String strng, String num) {
      ArrayList<String> listOfLines = new ArrayList<>();
      Pattern pattern = Pattern.compile("\".*\"");
      Matcher matcher = pattern.matcher(strng);
      while (matcher.find()) {

         System.out.println(matcher.group());

      }
      // your code
//      System.out.println(listOfLines.get(0));
      System.out.println("dfdf");
      return "";
   }
}