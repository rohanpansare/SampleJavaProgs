package Strings;

import java.util.Scanner;
/**
 * Created by Rohan Pansare on 2/24/2016.
 */
public class substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int size = sc.nextInt();
        String max= "";
        String min="zzzz";
        String[] s = new String[string.length() - size +1];
        for(int i = 0; i <= string.length()-size;i++){
         s[i] = string.substring(i,i+size);

        }
        for(int i = 0; i < s.length;i++){
            for(int j = 0; j < s.length;j++) {
                if(s[i].compareTo(s[j])>= 0 && s[i].compareTo(max)>0){
                    max = s[i];
                }
                if(s[i].compareTo(s[j])<= 0 && s[i].compareTo(min)<=0){
                    min = s[i];
                }
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
