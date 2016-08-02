public class LinkedListPrint {


   public static void main(String[] args) {
      Node head = new Node();
      Node headNull = null;
      head.data = 0;
      Node n1 = new Node();
      Node n2 = new Node();
      Node n3 = new Node();
      Node n4 = new Node();
      n1.data = 1;
      n2.data = 2;
      n3.data = 3;
      n4.data = 4;
      head.next = n1;
      n1.next = n2;
      n2.next = n3;
      n3.next = n4;

      LinkedListPrint test = new LinkedListPrint();
//      test.Print(head);
//      head = test.InsertNth(head, 99, 0);
      System.out.println();
//      test.Print(head);
//      head = test.delete(head, 3);
//      test.Print(head);
//      head = test.delete(head, 0);
      test.Print(head);
      head = test.Reverse(head);
      test.Print(head);
   }

   public void Print(Node head) {
      if (head != null) {
         System.out.print(head.data + " --> ");
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
      } else if (position == 1) {
         newNode.next = head.next;
         head.next = newNode;
      } else {
         InsertNth(head.next, data, position - 1);
      }
      return head;
   }

   Node delete(Node head, int position) {
      if (position == 0) {
         return head.next;
      } else if (position == 1) {
         if (head.next.next != null) {
            head.next = head.next.next;
         } else {
            head.next = null;
         }
      } else {
         delete(head.next, position - 1);
      }
      return head;
   }

   void ReversePrint(Node head) {
      if (head != null) {
         if (head.next != null) {
            ReversePrint(head.next);
            System.out.println(head.data);
         } else {
            System.out.println(head.data);
         }
      }
   }

   Node Reverse(Node head) {
      if (head == null || head.next == null) {
         return head;
      }
      Node reverse = Reverse(head.next);
      head.next.next = head;
      head.next = null;
      return reverse;

   }
}
