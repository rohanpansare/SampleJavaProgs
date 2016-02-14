    package HackerrankCollections;

    import java.util.Scanner;
    /**
     * Created by Rohan Pansare on 2/5/2016.
     */
    public class Onedarray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int no = sc.nextInt();
            int count = 0;
            int sum = 0;
            int[] arr = new int[no];
            int k = 1;
            for (int i = 0; i < no; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                sum=0;
                if (arr[i] < 0) {
                    count++;

                    //continue;
                }
                sum=arr[i];
                for (k=i+1; k < arr.length; k++) {

                  sum = sum + arr[k];
                    if(sum<0){
                        count++;
                    }
                  //  else
                    //break;
                }

            }
            System.out.println(count);

        }
    }
