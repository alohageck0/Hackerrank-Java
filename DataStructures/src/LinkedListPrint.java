import static jdk.nashorn.internal.objects.Global.print;

public class LinkedListPrint {
   class Node {
      int data;
      Node next;
   }

   public static void main(String[] args) {

   }

   public void Print(Node head) {
      if (head != null) {
         System.out.println(head.data);
         Print(head.next);
      }
   }
}
