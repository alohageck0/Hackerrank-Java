import org.testng.annotations.Test;

public class Unity {
   Node head = null;

   public Node put(int data) {
      Node next = new Node();
      next.data = data;
      if (head == null) {
         head = next;
      } else {
         Node tempHead = head;
         while (tempHead.next != null) {
            tempHead = tempHead.next;
         }
         tempHead.next = next;
      }
      return head;
   }

   public void printKthData(int k) {
      Node tempHead = head;
      int length = 0;
      while (tempHead.next != null) {
         tempHead = tempHead.next;
         length++;
      }
      for (int i = 0; i < length - k + 1; i++) {
         head = head.next;
      }
      System.out.println(head.data);

   }

   @Test
   public void test() {
      Unity list = new Unity();
      list.put(25);
      list.put(44);
      list.put(3);
      list.put(22);
      list.put(55);
      list.put(3);
      list.put(1);
      list.put(5);
      list.put(6);

      list.printKthData(2);

   }
   //25 44 3 22 55 3 1 5 6

}

class Node {
   int data;
   Node next = null;
}


