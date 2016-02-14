package AkunaCapital;

import java.util.*;
/**
 * Created by Rohan Pansare on 2/13/2016.
 */
public class Largestproductpair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr =new int[num];
        int i=0;
        int largest=Integer.MIN_VALUE,secondLargest=Integer.MIN_VALUE;
        System.out.println("Enter array elements: ");
        while(i!=num ){
            arr[i]=sc.nextInt();
            i++;
        }
        i=0;
        TreeSet<Integer> result = new TreeSet<>();

            while(i!=num ){
                if(!result.contains(arr[i])){
                result.add(arr[i]);

            }
                i++;
        }
        for(int j:result){
            System.out.print(j+" ");
        }
        System.out.println(result.pollLast()*result.pollLast());
    }
}
