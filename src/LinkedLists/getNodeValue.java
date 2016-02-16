package LinkedLists;

/**
 * Created by Rohan Pansare on 2/16/2016.
 */
public class getNodeValue {
/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/

    int GetNode(Node head,int n) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        Node temp = head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        int val = (count - n)-1;
        count=0;
        temp=head;
        while(count!=val){
            temp=temp.next;
            count++;
        }
        return temp.data;


    }

}

