/**
 * Created by Rohan Pansare on 1/23/2016.
 */
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] a) {
        Arrays.sort(a);
        elements=Arrays.copyOf(a,a.length);
        computeDifference();
    }

    public void computeDifference() {
        maximumDifference= Math.abs(elements[0]-elements[elements.length-1]);
    }
}
public class AbsDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        Difference D = new Difference(a);

        D.computeDifference();

        System.out.print(D.maximumDifference);
    }
}