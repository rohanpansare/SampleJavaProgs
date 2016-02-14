import java.util.Scanner;
/**
 * Created by Rohan Pansare on 1/23/2016.
 */
public class arraysum {

    public static void main(String args[]){
        int maxsum= Integer.MIN_VALUE;
        int temp;
        int arr[][] = new int[6][6];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=1;i<5;i++){
            for (int j=1;j<5;j++){
                temp =arr[i][j]+arr[i-1][j]+arr[i-1][j-1]+arr[i-1][j+1]+arr[i+1][j]+arr[i+1][j-1]+arr[i+1][j+1];
                if (temp>=maxsum){
                    maxsum=temp;
                }

            }

        }
        System.out.println(maxsum);
    }
}
