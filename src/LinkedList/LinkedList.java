package LinkedList;

import java.util.Scanner;
/**
 * Created by Rohan Pansare on 1/24/2016.
 */
public class LinkedList {

    public static void display(Node head)
    {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int N=sc.nextInt();
        while(N-->0){
            int ele=sc.nextInt();
            head=Solution1.insert(head,ele);
        }
        display(head);

    }
}

