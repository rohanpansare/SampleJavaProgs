package Zappos;

import java.util.HashMap;
import java.util.HashSet;
/**
 * Created by Rohan Pansare on 2/12/2016.
 */
public class zp {
    static int palindrome(String str) {
        int count = 0;
        HashSet sub = new HashSet();
        for (int i = 0; i < str.length(); i++) {
            // sub.add(i);
            sub.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (isPal(str.substring(i, j + 1))) {
                    sub.add(str.substring(i, j + 1));
                }
            }

        }
        return sub.size();
    }

    public static boolean isPal(String s) {
        if (s.length() == 0 || s.length() == 1)
            return true;
        if (s.charAt(0) == s.charAt(s.length() - 1))
            return isPal(s.substring(1, s.length() - 1));
        return false;
    }


    public static void main(String[] args) {
        String s = "aabaa";
        int result = palindrome(s);
        System.out.println(result);
    }
}
