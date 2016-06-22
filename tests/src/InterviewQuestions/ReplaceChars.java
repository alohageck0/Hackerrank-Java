package InterviewQuestions;

public class ReplaceChars {
   public static void main(String[] args) {


      String testString = "abcababaccababsssacbb";
      char testChar = 'b';
      System.out.println(replace(testString, testChar, 'z'));
      System.out.println(replaceRec(testString, testChar, 'z'));
   }

   public static String replace(String string, char oldChar, char newChar) {
      StringBuilder stringBuilder = new StringBuilder();
      char[] arr = string.toCharArray();
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] == oldChar) {
            stringBuilder.append(newChar);
         }else {
            stringBuilder.append(arr[i]);
         }
      }
      return stringBuilder.toString();
   }

   static String replaceRec(String string, char oldChar, char newChar) {
      if (string.length() > 0) {
         if (string.charAt(0) == oldChar) {
            return newChar + replaceRec(string.substring(1), oldChar, newChar);
         } else {
            return string.charAt(0) + replaceRec(string.substring(1), oldChar, newChar);
         }

      }
      return string;
   }
}
