package LinkedLists;

/**
 * Created by Rohan Pansare on 2/13/2016.
 */
public class Insertathead {/*
  Insert Node at the beginning of a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as

  }
*/
// This is a "method-only" submission.
// You only need to complete this method.
class Node {
    int data;
    Node next;
}
    Node Insert(Node head,int x) {

        if(head==null){
            Node temp = new Node();
            temp.data=x;
            temp.next=null;
            head=temp;
        }
        else{
            Node temp=new Node();
            temp.data=x;
            temp.next=head;
            head=temp;

        }
        return head;
    }

}
