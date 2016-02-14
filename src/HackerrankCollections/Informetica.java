//package HackerrankCollections;
//
///**
// * Created by Rohan Pansare on 2/8/2016.
// */
//public class Informetica {
//    public static void main(String[] args) {
//
//    }
//
//
//    //where did the list end ???
//    // what is the end marker ??
//    // DO we know the size of array ??
//    // yar iski standard algorithm hai; but aise tumhe samjha nai paunga
//    // Floyd cycle finding algorithm // also known as Hare and tortoise algorithm
//    //ek idea hai simple
//    // bol main list ko iterate karunga; firr saari nodes ko hashmap main daal dunga
//    // while iterating, agar koi node repeat ho gai toh main bolunga ke loop hia
//
//    // two pointers are used
//    // one is advanced by one
//    // other by two
//
//    /*if they both meet
//    there is cycle
//    and if the fast pointer reaches the end i.e 0th index
//            there is no cycle
//    */
//    /// standard searching is used
//
//    // if a node is repeated
//
//    // ek tree bna
//
//
//    // aur chala ke dikha;
//
//    //finding index of next node
//    private int nextNodeIndex(int array[], int currentIndex){
//        int nextIndex = (currentIndex + array[currentIndex]) % array.length;
//        return nextIndex;
//    }
//
//    // test karrke dikha de; chal jaega
//
//    //i.e. advancing by two
//    private static boolean cycleExists(int array[]){
//        // handling base cases
//        //null array or zero length arrayhtijikjgktjhkhjkjkhfkjkgnhkfhfmkjtkkjikhjkhjki
//        if(array == null || array.length == 0){
//            return false;
//        }
//
//        // single node pointing to itself
//        if(nextNode(array, 0) == 0){
//            return true;
//        }
//
//
//        boolean result = false;
//
//
//        int hare = nextNode(array, 0) , tortoise= nextNode(array, 0);
//
//        boolean cycleExists = false;
//        while(hare != 0 && nextNode(array, hare) != 0 && nextNode(array, nextNode(array, hare)) != 0){
//            hare = nextNode(array, nextNode(array, hare));
//            tortoise = nextNode(array, hare);
//
//            if(hare == tortoise){
//                // cycle exists
//                cycleExists = true;
//                break;
//            }
//
//        }
//        return cycleExists;
//    }
//
//    /*private static Node cloneTree(Node root){
//        // brace lga
//        //ek e line hai iss if main;
//        if(root == null){
//            return null;
//        }
//
//        // clone left subtree; if exixts
//        Node leftClone = null;
//        if(root.left != null){
//            leftClone = cloneTree(root.left);
//        };
//
//        Node rightClone = null;
//        if(root.right != null){
//            rightClone = cloneTree(root.right);
//        };
//
//        //bolta reh kya karr ra hai tu
//        Node currentNode = new Node();
//        currentNode.data = root.data;
//
//        currentNode.left = leftClone;
//        currentNode.right = rightClone;
//        return currentNode;
//
//
//        // I am recursing the tree in postorder
//        // firstly clone left subtree and then clone right subtree
//        // and the join it afterwards.
//    }*/
//}
