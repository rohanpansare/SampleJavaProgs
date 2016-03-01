package LinkedList.Trees;

import java.util.LinkedList;
import java.util.Queue;
/**
 * Created by Rohan Pansare on 2/18/2016.
 */
public class levelorder {

    class Node {
        int data;
        Node left;
        Node right;
    }

    void LevelOrder(Node root)
    {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
    }

}
