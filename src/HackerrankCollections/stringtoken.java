import java.io.*;
import java.util.*;



public class stringtoken {


    public static void main(String[] args)
    {

        int count=0;
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();
        //Complete the code
        String a =s.replaceAll("[^a-zA-Z]+"," ").trim();
        for(String word : a.split(" "))
        {
            count++;

        }
        System.out.println(a);
        if(a.equals(" ")){
            count =0;
        }

        System.out.println(count);
        for(String word : a.split(" "))
        {

            System.out.println(word);
        }
    }
}
