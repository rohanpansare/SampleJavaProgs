package LinkedList.Trees;

/**
 * Created by Rohan Pansare on 2/17/2016.
 */
public class treetopview {

   class Node {
       int data;
       Node left;
       Node right;
   }
    void top_view(Node root)
    {
        top_view_left(root);
        top_view_right(root.right);
    }
    void top_view_left(Node root)
    {
        Node temp=root;

        if(root==null) return;
        top_view_left(root.left);
        System.out.print(root.data+" ");

    }
    void top_view_right(Node root)
    {
        if(root==null) return;
        System.out.print(root.data+" ");
        top_view_right(root.right);

    }

}
