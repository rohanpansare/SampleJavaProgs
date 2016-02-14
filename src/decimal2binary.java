import java.util.Scanner;
/**
 * Created by Rohan Pansare on 1/23/2016.
 */
public class decimal2binary {

    public static void main(String[] args) {
        String temp;
        String ans="";
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int noOfCases = sc.nextInt();
        int no[] = new int[noOfCases];
        for (int i= 0;i<noOfCases;i++){
            no[i]=sc.nextInt();

        }
        for(int i=0;i<noOfCases;i++){
            int number=no[i];
            while(number!=0){

             temp= String.valueOf(number%2);
                ans=ans+temp+"";
                number=number/2;
            }
            for(int j=ans.length()-1;j>=0;j--) {
                System.out.print(ans.charAt(j));
            }
            System.out.println();
            ans="";
        }
    }
}
