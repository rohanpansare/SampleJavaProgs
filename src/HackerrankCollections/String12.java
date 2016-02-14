package HackerrankCollections;

import java.io.*;
import java.util.*;

public class String12 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();

        /* Enter your code here. Print output to STDOUT. */
        //Sum of lengths of strings;
        System.out.println(a.length +b.length + " ");
        int temp= A.compareTo(B);
        if(temp<=0){
            System.out.println("No");
        }
        else System.out.println("Yes");
            a[0]=Character.toUpperCase(A.charAt(0));
        b[0]=Character.toUpperCase(B.charAt(0));
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.print(" ");
        for (int i=0;i<b.length;i++){
            System.out.print(b[i]);
        }


        String line = "I am a java developer";
        String[] words = line.split(" ");
        String[] twoWords = line.split(" ", 2);
        System.out.println("String split with delimiter: "+Arrays.toString(words));
        System.out.println("String split into two: "+Arrays.toString(twoWords));
    }
}
