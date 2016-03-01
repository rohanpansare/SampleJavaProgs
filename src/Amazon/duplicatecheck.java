package Amazon;

import java.util.HashSet;
import java.util.Scanner;
/**
 * Created by Rohan Pansare on 2/29/2016.
 */
public class duplicatecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,2,5,1,3};
        HashSet<Integer> hs = new HashSet<>();
        System.out.print("Duplicate elements are ");
        for(int i =0;i<arr.length;i++){

            if(!hs.add(arr[i])){
                System.out.print(" "+arr[i]);
            }
        }
    }
}
