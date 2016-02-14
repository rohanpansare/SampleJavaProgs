import java.util.Stack;

/**
 * Created by ameya on 1/27/16.
 */
public class test4 {

    public class Node{
        String data;
        Node next;
        public Node(String data, Node next){
            this.data=data;
            this.next=next;
        }
    }

    public Node head=null;

    public void addFirst(String data){
        head=new Node(data,head);
    }
//
//    public void addAtEnd(String data){
//        if(head == null){
//            head=new Node(data,null);
//        }
//            Node temp=head;
//            while(temp.next != null){
//                temp=temp.next;
//            }
//            temp.next=new Node(data,null);
//
//    }


    public void addAfter(String anchorData, String data){
        for(Node n = head; n != null; n = n.next){
            if(n.data == anchorData) n.next = new Node(data, n.next);
        }
    }

    public void addAtEnd(String data){
        Node tmp = head;
        while(tmp.next !=null) tmp = tmp.next;

        tmp.next = new Node(data, null);
    }



    public void print(){
        Node temp=head;
        while(temp.next != null){
            System.out.println(head.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        test4 ll =new test4();



        //ll.addFirst("Hello");

        ll.addFirst("First");
        ll.addAfter("First","Second");
        ll.addAfter("First","Third");
        ll.addAfter("Second","Fourth");
        ll.addAtEnd("This");
        ll.addAtEnd("is");
        ll.addAtEnd("my");
        ll.addAtEnd("LL");
        ll.print();

    }
}