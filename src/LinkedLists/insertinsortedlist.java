package LinkedLists;

/**
 * Created by Rohan Pansare on 2/17/2016.
 */
public class insertinsortedlist {

  class Node {
     int data;
     Node next;
     Node prev;
  }


     Node SortedInsert(Node head,int data) {
        Node temp=head;
        Node temp1=head;
        Node previousNode = head;
        if(head==null){
            temp = new Node();
            head =temp;
            head.data=data;
            return head;
        }

        while(temp.next!=null && data > temp.data){
            temp=temp.next;
        }

        if(temp.next==null && temp.data < data){
            temp1=new Node();
            temp1.prev=temp;
            temp1.data=data;

            temp.next=temp1;

        } else if(temp==head){
            temp = new Node();
            temp.next=head;

            head.prev=temp;
            head =temp;
        } else{
            temp1= new Node();
            temp1.data=data;
            temp1.prev=temp.prev;
            temp1.next=temp;

            temp1.prev.next=temp1;
            temp.prev=temp1;
        }
        return head;
    }

    public static void main(String[] args) {
        insertinsortedlist obj = new insertinsortedlist();
        Node head = null;
        head = obj.SortedInsert(head, 10);
        head = obj.SortedInsert(head, 20);
        head = obj.SortedInsert(head, 30);
        head = obj.SortedInsert(head, 40);
        head = obj.SortedInsert(head, 35);
        head = obj.SortedInsert(head, 0);
        head = obj.SortedInsert(head, 1);
        head = obj.SortedInsert(head, 2);
        head = obj.SortedInsert(head, 70);
        head = obj.SortedInsert(head, 69);
        head = obj.SortedInsert(head, 4);
      //  head = obj.SortedInsert(head, 30);
        while (head != null) {
            System.out.println(head.data);
            head=head.next;
        }
    }
}
