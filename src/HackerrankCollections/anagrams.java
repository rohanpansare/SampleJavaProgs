package HackerrankCollections;

import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by Rohan Pansare on 2/13/2016.
 */
public class anagrams {

        static boolean isAnagram(String A, String B) {
            //Complete the function
            char[] chars = A.toLowerCase().toCharArray();
            char[] chars1 = B.toLowerCase().toCharArray();
            Arrays.sort(chars);
            Arrays.sort(chars1);
            String s1 = new String(chars);
            String s2 = new String(chars1);
            if(s1.equals(s2))
            {
                return true;
            }
            else return false;


        }
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B=sc.next();
            boolean ret=isAnagram(A,B);
            if(ret)System.out.println("Anagrams");
            else System.out.println("Not Anagrams");

        }


}
