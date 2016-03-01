package LinkedLists;

/**
 * Created by Rohan Pansare on 2/16/2016.
 */
public class mergepoint {
    /*
  Insert Node at the end of a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
    int FindMergeNode(Node headA, Node headB) {
        // Complete this function
        // Do not write the main method.
        Node temp= headA;
        Node temp1 = headB;
        int m = lengthOfList(headA);
        int n = lengthOfList(headB);
        int diff=0;
        int diff1=0;
        if(m>n){
            diff=m-n;
        }

        if(n>m){
            diff1=n-m;
        }

        for(int i= 0;i<diff;i++){
            temp=temp.next;
        }
        for(int i= 0;i<diff1;i++){
            temp1=temp1.next;
        }
        while(temp!=null){
            if(temp==temp1){
                return temp.data;
            }
            temp=temp.next;
            temp1=temp1.next;
        }
        return 0;
    }

    static int lengthOfList(Node head){
        int length=0;
        while(head!=null){
            length++;
            head=head.next;
        }
        return length;
    }

}
