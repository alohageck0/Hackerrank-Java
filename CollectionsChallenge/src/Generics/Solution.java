package Generics;

import java.lang.reflect.Method;

class Printer {
   public Printer() {
   }

   public void printArray(Object[] arr) {
      for (Object obj : arr) {
         System.out.println(obj);
      }

   }
   //Write your code here

}


public class Solution {
   public static void main(String args[]) {
      Printer myPrinter = new Printer();
      Integer[] intArray = {1, 2, 3};
      String[] stringArray = {"Hello", "World"};
//      System.out.println(intArray);zzzzz
      myPrinter.printArray(intArray);
      myPrinter.printArray(stringArray);
      int count = 0;
      for (Method method : Printer.class.getDeclaredMethods()) {
         String name = method.getName();
         if (name.equals("printArray"))
            count++;
      }

      if (count > 1) System.out.println("Method overloading is not allowed!");
      assert count == 1;

   }
}
