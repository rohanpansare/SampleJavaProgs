package AkunaCapital;

import java.util.Scanner;
import java.util.Stack;
/**
 * Created by Rohan Pansare on 2/13/2016.
 */
public class BitCount {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Create Stack object
        Stack<Integer> stack = new Stack<Integer>();

        // User input
        System.out.println("Enter decimal number: ");
        int num = in.nextInt();

        while (num != 0)
        {
            int d = num % 2;
            stack.push(d);
            num /= 2;
        }
        long count=0;
        System.out.println(stack.size());
        System.out.print("\nBinary representation is:");
        while (!(stack.isEmpty() ))
        {
            if(stack.peek()==1){
                count++;
            }
            System.out.print(stack.pop());
        }
        System.out.println("Number of 1's bit are: "+count);
    }
}
