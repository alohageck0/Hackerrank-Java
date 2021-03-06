package InterviewQuestions.book.stringsAndArrays;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.*;

import static com.sun.tools.javac.jvm.ByteCodes.new_;
import static com.sun.tools.javac.jvm.ByteCodes.ret;

public class FirstNonRepeatedSChar {
   long start, finish;

   @BeforeMethod
   public void start() {
      start = System.nanoTime();
   }

   @AfterMethod
   public void end() {
      finish = System.nanoTime();
      System.out.println(finish - start);
   }

   @Test
   public void test() {
      Assert.assertEquals(getFirstNonRepeatedChar("asdasdfasdasdasdasdasasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasddasdasdasdasdasdsadasdasdasdasdasdsadfv"), 'v');
//      Assert.assertEquals(getFirstNonRepeatedChar("agsdasdffv"), 'g');
//      Assert.assertEquals(getNonRepRecursive("agsdasdffv"), "g");
   }

   @Test
   public void test1() {
      Assert.assertEquals(getNonRepRecursive("asdasdfasdasdasdasdasasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasddasdasdasdasdasdsadasdasdasdasdasdsadfv"), "v");

   }@Test
   public void test2() {
      Assert.assertEquals(getNon("asdasdfasdasdasdasdasasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasddasdasdasdasdasdsadasdasdasdasdasdsadfv"), "v");

   }

   public char getFirstNonRepeatedChar(String input) {
      char result = ' ';
      if (input.length() == 0) {
         return result;
      } else if (input.length() == 1) {
         return input.charAt(0);
      } else {
         Map<Character, Integer> chars = new LinkedHashMap<>();
         for (int i = 0; i < input.length(); i++) {
            char key = input.charAt(i);
            if (chars.containsKey(key)) {
               chars.put(key, chars.get(key) + 1);
            } else {
               chars.put(key, 1);
            }
         }
         for (Character key : chars.keySet()) {
            if (chars.get(key) == 1) {
               result = key;
               break;
            }
         }
      }
      return result;
   }

   public String getNonRepRecursive(String input) {
      if (input.length() == 1) {
         return input;
      } else {
         char c = input.charAt(0);
         for (int i = 1; i < input.length(); i++) {
            if (c == input.charAt(i)) {
               return getNonRepRecursive(input.replaceAll(String.valueOf(c), ""));
            }
         }
         return String.valueOf(c);
      }
   }

   public String getNon(String input) {
      Set<Character> set = new HashSet<>();
      List<Character> list = new ArrayList<>();
      for (int i = 0; i < input.length(); i++) {
         char test = input.charAt(i);
         if (set.contains(test)) {
            continue;
         }
         if (list.contains(test)) {
            list.remove(Character.valueOf(test));
            set.add(test);
         } else {
            list.add(test);
         }
      }
      return String.valueOf(list.get(0));
   }
}
