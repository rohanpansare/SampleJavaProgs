package Strings;

import java.util.Scanner;
/**
 * Created by Rohan Pansare on 2/28/2016.
 */
public class sumofdigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int temp=0;
        int count=0;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            temp=n;
            int i = 0;
            int val = 0;         //1234
            //String s3 = Integer.toString(n);
            while(n!=0){
                val = n % 10;
                if(val==0){
                    n=n/10;
                    continue;
                }
                if(temp%val ==0)
                {
                    count++;

                }
                n=n/10;
            }
            System.out.println(count);
            count=0;
        }
    }
}
