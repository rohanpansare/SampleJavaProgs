package LinkedLists;

/**
 * Created by Rohan Pansare on 2/15/2016.
 */
class Node {
    int data;
    Node next;
}
public class Deleteanode {


    static Node Delete(Node head, int position) {
        // Complete this method
        Node temp = head;
        if (head.next == null) {//If only one node exists.
            head = null;
            return head;
        }
        if (position == 0) {//If need to insert at first position, change the head.
            head = temp.next;
            temp.next = null;
            return head;
        }
        int i = 0;
        while (i != (position - 1)) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node();
        head.data = 10;
        Node newnode1 = new Node();
        newnode1.data = 20;
        head.next = newnode1;
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        head = Delete(head, 0);
        head = InsertNth(head, 100, 1);
        temp = head;
        System.out.println("After deleting and inserting");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("Reverse Print:");
        ReversePrint(head);
        String s = "abcdefghi";
        String result=reverse(s);
        System.out.println(result);
    }

    static Node InsertNth(Node head, int data, int position) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        Node newnode = new Node();
        if (head == null) {
            newnode.data = data;
            head = newnode;
            return head;
        } else if (position == 0) {
            newnode.data = data;
            newnode.next = head;
            head = newnode;
            return head;
        } else {
            Node temp = head;
            int i = 0;
            while (i != position) {
                i++;
                temp = temp.next;
            }
            if (i == position) {
                Node temp1 = head;
                while (temp1.next != temp) {
                    temp1 = temp1.next;
                }
                temp1.next = newnode;
                newnode.data = data;
                newnode.next = temp;

            }
        }
        return head;
    }
    static void ReversePrint(Node head) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        Node temp =head;
        if(temp==null){
            System.out.println("");
        }
        else if(temp.next==null){
            System.out.println(temp.data);
        }
        else{
            ReversePrint(temp.next);
            System.out.println(temp.data);
        }

    }

    public static String reverse(String s){
        String result="";
        if(s.length()<2){
            return s;
        }
        else
        result= reverse(s.substring(1))+s.charAt(0);
        return result;
    }



}
