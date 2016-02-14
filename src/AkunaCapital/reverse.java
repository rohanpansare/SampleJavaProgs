package AkunaCapital;

import java.util.*;
/**
 * Created by Rohan Pansare on 2/13/2016.
 */
public class reverse {
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

        i=0;
        int size = result.size();
        int[] arr1=new int[result.size()];
        while(i<size){
            arr1[i]=result.pollLast();
            i++;
        }

    }

    static String IntersectStrings(String first, String second) {
        String s1 = first;
        String s2 = second;

        char[] s1Array = s1.toCharArray();
        char [] s2Array = s2.toCharArray();


        Set<Character>s1CharSet = new HashSet<Character>();
        Set<Character>s2CharSet = new HashSet<Character>();

        for(char c:s1Array){
            s1CharSet.add(c);
        }

        for(char c: s2Array){
            s2CharSet.add(c);
        }

        s1CharSet.retainAll(s2CharSet);
        String res="";
        for(char c: s1Array){
            res=res+c;
        }

        if(s1CharSet.size()==0){
            return "";
        }

        else{
            return res;
        }

    }
}