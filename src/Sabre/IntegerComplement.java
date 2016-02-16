package Sabre;

import java.util.Scanner;
/**
 * Created by Rohan Pansare on 2/15/2016.
 */
public class IntegerComplement {
    static int getIntegerComplement(int n)
    {
        int comp = 0;
        int rem=0;
        int count =0;

        if (n == 1)
        {
            return 0;
        }
        else if(n == 0)
        {
            return 1;
        }
        while(n>1)
        {
            rem = n % 2;
            n= n / 2;
            if(rem==0)
                comp= (int) (comp+1*Math.pow(2, count));
            count++;
        }
        if(n == 0)
        {
            comp= (int) (comp+1*Math.pow(2, count));
        }


        return comp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int no = sc.nextInt();
        int complement=getIntegerComplement(no);
        System.out.println(complement);
    }
}
