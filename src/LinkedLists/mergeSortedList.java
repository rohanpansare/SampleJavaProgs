package LinkedLists;

/**
 * Created by Rohan Pansare on 2/15/2016.
 */
public class mergeSortedList {
    /*
  Merge two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/

    Node MergeLists(Node headA, Node headB) {
        // This is a "method-only" submission.
        // You only need to complete this method
        Node dummy = new Node();
        Node head=dummy;
        while(headA != null && headB != null){
            if(headA.data < headB.data){
                dummy.next=headA;
                headA=headA.next;

            }
            else{
                dummy.next=headB;
                headB=headB.next;

            }
            dummy=dummy.next;
        }
        if(headA!=null){
            dummy.next = headA;
            //headA=headA.next;

        }
        if(headB!=null){
            dummy.next = headB;
            //headB=headB.next;

        }
        return head.next;
    }

}
