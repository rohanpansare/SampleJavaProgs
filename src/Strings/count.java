package Strings;

import java.util.Scanner;
/**
 * Created by Rohan Pansare on 2/24/2016.
 */
public class count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int count=0;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
                if(a[a_i]<=0){
                    count++;
                }
            }
            if(count>=k){
                System.out.println("NO");
                count=0;
                continue;
            }
            else
                System.out.println("YES");
                count=0;

        }
    }
}
