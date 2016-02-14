
import java.util.LinkedList;
import java.util.Stack;
class Palindrome {
    Stack s1 = new Stack();
    LinkedList q =new LinkedList<>();
   public Palindrome(){


     // LinkedList q =new LinkedList<>();
   }
   public void pushCharacter(char c) {


           s1.push(c);


   }

   public char popCharacter() {
       char c = (char) s1.pop();
       return c;
   }

   public char dequeueCharacter() {
       char c = (char) q.removeFirst();
       return c;
   }

   public void enqueueCharacter(char c) {

       q.addLast(c);
   }
   //Write your code here

}
