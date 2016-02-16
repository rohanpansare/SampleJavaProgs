package LinkedLists;

/**
 * Created by Rohan Pansare on 2/16/2016.
 */
public class Removeduplicates {
    /*
Node is defined as
  class Node {
     int data;
     Node next;
  }
*/

    Node RemoveDuplicates(Node head) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        Node current = head;
        Node next = head.next;
        while(next!=null){
            if(current.data==next.data){
                current.next=next.next;
                next=next.next;
                continue;
            }
            else{
                current = current.next;
                next=next.next;
            }
        }
        return head;
    }

}
