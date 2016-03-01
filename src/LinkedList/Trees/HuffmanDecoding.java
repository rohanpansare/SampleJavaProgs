package LinkedList.Trees;

/**
 * Created by Rohan Pansare on 2/18/2016.
 */
public class HuffmanDecoding {

   class Node {
       public int frequency; // the frequency of this tree
       public char data;
       public Node left, right;
   }


    void decode(String S ,Node root)
    {
        Node temp = root;
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            if(c=='0'){
                if(temp.left!=null && temp.left.data != '\0'){
                    System.out.print(temp.left.data);
                    temp=root;
                    continue;
                }
                else{
                    temp = temp.left;
                    continue;
                }
                
            }
            if(c=='1'){
                if(temp.right!=null && temp.right.data != '\0'){
                    System.out.print(temp.right.data);
                    temp=root;
                    continue;
                }
                else{
                    temp = temp.right;
                    continue;
                }
            }
        }


    }

}
