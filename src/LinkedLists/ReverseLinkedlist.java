package LinkedLists;

/**
 * Created by Rohan Pansare on 2/15/2016.
 */
public class ReverseLinkedlist {
    /*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission.
    // You only need to complete this method.
    Node Reverse(Node head) {
        if(head==null){
            return head;
        }
        if(head.next==null){
            return head;
        }
        Node current=head;
        Node previous=null,next=null;
    /*
    Make 'current' point to 'head'.
    Make 'next node' point to next of 'current'.
    Then next of 'current' points to 'previous'
    Then 'previous' moves to 'current'
    And 'current' moves to 'next'
    Do it iteratively.
    Then make head point to prev.
    return head;
    */
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        head=previous;  //Make head point to last node;
        return head;
    }

}
