package LinkedLists;

/**
 * Created by Rohan Pansare on 2/16/2016.
 */
public class cycledetection {
    /*
  Detect cycle in the list
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
    int HasCycle(Node head) {
        if(head == null){
            return 0;
        }
        Node slow = head;
        Node fast = head.next;
        while(slow != fast && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow==fast){
            return 1;
        }
        else{
            return 0;
        }

    }

}
