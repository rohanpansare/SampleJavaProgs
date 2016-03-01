package Amazon;
/*Reverse string order in sentence and each corresponding words.      */
import java.util.Scanner;
import java.util.Stack;
/**
 * Created by Rohan Pansare on 2/28/2016.
 */
public class ReverseString {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        for(int i = 0;i<words.length;i++){
            words[i]=reverse(words[i]);

        }
        Stack<String> stack = new Stack();
        for(int i = 0;i<words.length;i++){
            stack.add(words[i]);

        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }

    }

    private static String reverse(String word) {
        char[] word1 = word.toCharArray();
        char temp;
        int j=word1.length-1;
        for(int i=0;i<j;i++){
            temp=word1[i];
            word1[i]=word1[j];
            word1[j]=temp;
            j--;
        }
        return new String(word1);
    }


}
