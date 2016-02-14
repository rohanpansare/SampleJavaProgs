/**
 * Created by Rohan Pansare on 1/25/2016.
 */
import java.io.*;
import java.util.*;
interface AdvancedArithmetic{
    int divisorSum(int n);
}
public class divisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        AdvancedArithmetic myCalculator=new Calculator();
        int sum=myCalculator.divisorSum(n);
        System.out.println("I implemented: AdvancedArithmetic\n"+sum);
    }
}
//Write your code here

class Calculator implements AdvancedArithmetic{
    int ans=0;
    public int divisorSum(int n){
        for(int i=n;i>=1;i--){
            if(n%i == 0){
                ans=ans +i;

            }
            i--;

        }
        return ans;
    }

}