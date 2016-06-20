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

   Node Insert(Node head, int data) {
      Node newNode = new Node();
      newNode.data = data;
      if (head == null) {
         newNode.next = null;
         return newNode;
      }
      if (head.next == null) {
         newNode.next = null;
         head.next = newNode;
      } else {
         Insert(head.next, data);
      }
      return head;
   }

   Node InsertAtHead(Node head, int x) {
      Node newHead = new Node();
      newHead.data = x;
      if (head == null) {
         newHead.next = null;
      } else {
         newHead.next = head;
      }
      return newHead;
   }

   //todo not finished
   Node InsertNth(Node head, int data, int position) {
      Node newNode = new Node();
      newNode.data = data;
      if (head == null) {
         newNode.next = null;
         head = newNode;
      }
      if (position == 0) {
         newNode.next = head;
         head = newNode;
      }
      if (position == 1) {
         newNode.next = head.next;
         head.next = newNode;
      } else {
         InsertNth(head.next, data, position - 1);
      }
      return head;
   }
}
