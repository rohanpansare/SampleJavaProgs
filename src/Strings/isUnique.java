package Strings;

import java.util.Scanner;
/**
 * Created by Rohan Pansare on 2/25/2016.
 */
public class isUnique {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 = "adasdad";
        int val = 0;
        int checker = 0;
        int flag =1;
        for (int i = 0; i < string1.length(); i++) {
            val = string1.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                System.out.println("Not unique");
                flag =0;
                break;
            }
            checker |= (1 << val);
        }
        if(flag==1)
        System.out.println("Unique");
    }


}

