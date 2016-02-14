package LinkedList;

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }

}
class Solution1 {
    public static Node insert(Node head, int data) {
        //Complete this method
        if(head==null){
             head = new Node(data);
            return head;
        }
        else{
            Node temp = new Node(data);
            Node current = head;
            while(current.next != null){
                current = current.next;

            }
            current.next=temp;
        }


//        LinkedList.Node temp = new LinkedList.Node(data);
//        LinkedList.Node current =head;
//        head.data = data;
//        head = head.
//                head.next = null;
        return head;
    }
}