package Sabre;

import java.io.*;
import java.util.*;

public class triangle {
    private static boolean isValidTriangle(int a, int b, int c){
        return a + b > c && a + c > b && b + c > a ;
    }
    public static void main(String args[] ) throws Exception {

        Scanner in = new Scanner(System.in);
        int totalTestCases= in.nextInt();


        while(totalTestCases-- > 0){
            int a= in.nextInt();
            int b= in.nextInt();
            int c= in.nextInt();
            if(isValidTriangle(a,b,c)){
                if(a==b && b==c && a==c){
                    System.out.println("Equilateral");
                } else if (a==b || b==c || c==a){
                    System.out.println("Isoceles");
                } else {
                    System.out.println("None of these");
                }
            } else {
                System.out.println("None of these");
            }


        }
    }

}