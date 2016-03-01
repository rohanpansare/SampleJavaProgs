package LinkedList.Trees;

/**
 * Created by Rohan Pansare on 2/18/2016.
 */
public class BSTinsert {

 class Node {
    int data;
    Node left;
    Node right;
    }


    Node Insert(Node root, int value)
    {
        Node temp1;
        if(root == null){
            root = new Node();
            root.data=value;
            return root;
        }
        Node temp=root;
        while(temp!=null){
            if(temp.data<value){
                if(temp.right!=null){
                    temp=temp.right;
                }
                else{
                    temp1 = new Node();
                    temp.right=temp1;
                    temp1.data=value;
                    return root;
                }
            }
            else if(temp.data>=value){
                if(temp.left!=null){
                    temp=temp.left;
                }
                else{
                    temp1 = new Node();
                    temp.left=temp1;
                    temp1.data=value;
                    return root;
                }

            }

        }
        return root;
    }







}
