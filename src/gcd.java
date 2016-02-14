import java.util.Scanner;
/**
 * Created by Rohan Pansare on 1/22/2016.
 */
public class gcd {
    static int ans;

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Take Input
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd=find_gcd(a,b);
        System.out.println(gcd);
    }
    static  int find_gcd(int a,int b){

        //Write the base condition
        if(a==b)
        {

             ans=a;
            return ans;
        }
        else if(a>b){
            a=a-b;
            find_gcd(a,b);
        }
        else if(a<b){
            int temp=a;

            a=b-temp;
            b=temp;
            find_gcd(a,b);
        }

        return ans;
    }
}
