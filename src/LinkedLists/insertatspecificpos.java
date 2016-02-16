package LinkedLists;



import java.util.Scanner;
/**
 * Created by Rohan Pansare on 2/15/2016.
 */
public class insertatspecificpos {

  class Node {
     int data;
     Node next;
  }



     Node InsertNth(Node head, int data, int position) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        Node newnode = new Node();
        if(head==null){

            newnode.data=data;
            head = newnode;
            return head;
        }
        else{
            Node temp=head;
            int i=0;
            while(i!=position){
                i++;
                temp=temp.next;
            }

            if(i==position){
                Node temp1=head;
                while(temp1.next!=temp){
                    temp1=temp1.next;
                }
                temp1.next=newnode;
                newnode.data=data;
                newnode.next=temp;

            }
        }
        return head;

    }


}
