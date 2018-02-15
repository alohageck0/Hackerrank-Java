import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPrint {

   @Test
   public void testMerge() {
      LinkedList<Integer> list1 = new LinkedList<>();
      LinkedList<Integer> list2 = new LinkedList<>();
      list1.add(2);
      list1.add(5);
      list1.add(7);
      list1.add(8);
      list1.add(11);
      list2.add(1);
      list2.add(6);
      list2.add(9);
      list2.add(10);
      list2.add(13);
      list2.add(55);
      list2.add(66);
      list2.add(77);
      list2.add(79);


      System.out.println(mergeOrderedLists(list1, list2).toString());
   }

   public static void main(String[] args) {
      Node head = new Node();
      Node headB = new Node();
      head.data = 0;
      headB.data = 0;
      Node n1 = new Node();
      Node na1 = new Node();
      Node n2 = new Node();
      Node na2 = new Node();
      Node n3 = new Node();
      Node na3 = new Node();
      Node n4 = new Node();
      Node na4 = new Node();
      n1.data = 1;
      na1.data = 1;
      na2.data = 2;
      n2.data = 2;
      na3.data = 3;
      n3.data = 3;
      na4.data = 4;
      n4.data = 4;
      head.next = n1;
      headB.next = na1;
      n1.next = n2;
      na1.next = na2;
      n2.next = n3;
      na2.next = na3;
//      n3.next = n4;
      na3.next = na4;

      LinkedListPrint test = new LinkedListPrint();
//      test.Print(head);
//      head = test.InsertNth(head, 99, 0);
      System.out.println();
//      test.Print(head);
//      head = test.delete(head, 3);
//      test.Print(head);
//      head = test.delete(head, 0);
      test.Print(head);
//      head = test.Reverse(head);
      System.out.println("Print h");
//      test.Print(headB);
      System.out.println();
      head = test.MergeLists(head, headB);
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

   int CompareLists(Node headA, Node headB) {
      int result = 1;
      if (headA == null || headB == null) {
         return 0;
      }
      if (headA.data == headB.data) {
         if (headA.next != null && headB.next != null) {
            result = CompareLists(headA.next, headB.next);
         } else {
            if (headB.next != null || headA.next != null) {
               return 0;
            }
         }
      } else {
         return 0;
      }
      return result;
   }

   Node MergeLists(Node headA, Node headB) {
      if (headA == null) {
         return headB;
      } else if (headB == null) {
         return headA;
      }

      if (headA.data <= headB.data) {
         headA.next = MergeLists(headA.next, headB);
         return headA;
      } else {
         headB.next = MergeLists(headA, headB.next);
         return headB;
      }
   }

   List<Integer> mergeOrderedLists(List<Integer> list1, List<Integer> list2) {
      List<Integer> result = new LinkedList<>();
      Iterator<Integer> it1 = list1.listIterator();
      Iterator<Integer> it2 = list2.listIterator();
      int val1 = it1.next();
      int val2 = it2.next();
      while (it1.hasNext() && it2.hasNext()) {
         if (val1 < val2) {
            result.add(val1);
            val1 = it1.next();
            it1.remove();
         } else {
            result.add(val2);
            val2 = it2.next();
            it2.remove();
         }
      }
      if (it1.hasNext()){
         result.addAll(list1);
      } else {
         result.addAll(list2);
      }
      return result;
   }
}
