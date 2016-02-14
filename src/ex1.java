import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ex1 {

    public static void main(String[] args) {
        Double tip;
        Double tax;
        int finalPrice;
        Scanner sc = new Scanner(System.in);
        double M = sc.nextDouble(); // original meal price
        int T = sc.nextInt(); // tip percentage
        int X = sc.nextInt(); // tax percentage

        tip = T*M/100;
        tax = X*M/100;
        finalPrice = (int) Math.round(tip + tax + M) ;
        System.out.println("The final price of the meal is $"+finalPrice+".");


        // Enter your code here!
        // Run some computations....

        // int total = (int) Math.round(/*numberToRoundHere*/);

        // ...then print!

    }
}
