package InterviewQuestions.book.stringsAndArrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

import static javafx.scene.input.KeyCode.Q;

public class Anagram {

   @Test
   public void test(){
      Assert.assertTrue(ifAnagram("Mary", "Yram"));
      Assert.assertTrue(ifAnagram("Ma ry", "Yra2m"));
      Assert.assertTrue(ifAnagram("Mary  ", "Yr()am"));
   }

   public boolean ifAnagram(String string1, String string2) {
      if (string1.length() != string2.length()) {
         return false;
      }
      string1 = string1.toLowerCase();
      string2 = string2.toLowerCase();

      Queue<Character> queue = new LinkedList<>();
      Stack<Character> stack = new Stack<>();
      for (int i = 0; i < string1.length(); i++) {

         int asciiCharOfString1 = (int) (string1.charAt(i));
         if (asciiCharOfString1 > 96 && asciiCharOfString1 < 123) {
            queue.add(string1.charAt(i));
         }
         int asciiCharOfString2 = (int) (string2.charAt(i));
         if (asciiCharOfString2 > 96 && asciiCharOfString2 < 123) {
            stack.add(string2.charAt(i));
         }
      }
      while (!queue.isEmpty() && !(stack.isEmpty())) {
         if (!queue.poll().equals(stack.pop())) {
            return false;
         }
      }

      return true;
   }
}
