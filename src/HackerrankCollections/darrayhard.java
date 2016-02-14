package HackerrankCollections;

import java.util.Scanner;
/**
 * Created by Rohan Pansare on 2/5/2016.
 */
public class darrayhard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTestCases = sc.nextInt();
        int jump;
        int j;
        while (noOfTestCases != 0) {
            int no=sc.nextInt();
             jump=sc.nextInt();
            int[] arr = new int[no];
            int k = arr.length;
            for (int i = 0; i < no; i++) {
                arr[i] = sc.nextInt();
            }
            for ( j = 0; j < arr.length; j++) {
             if(arr[j]==0){
                 j=j+jump-1;
                 if(j>=k){
                     //System.out.println("YES");
                     break;
                 }
                 continue;
             }
                if(j<k ){

                  //  if[arr[j]<]
//                    j=j+jump-1;
//                    if(j>=k){
//                        //System.out.println("YES");
//                        break;
//                    }
//                     if(arr[j]==1){
//                        System.out.println("NO");
//                        break;
//                    }

                }
            }
            if(j>=k){
                System.out.println("YES");
            }

         noOfTestCases--;
        }
    }
}
