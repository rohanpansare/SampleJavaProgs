package HackerrankCollections;

import java.util.Scanner;
/**
 * Created by Rohan Pansare on 2/5/2016.
 */
public class duplicateodd {
    public static void main(String[] args) {
        int count = 0;
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int[] nos = new int[sc.nextInt()];
        for (int i = 0; i < nos.length; i++) {
            nos[i] = sc.nextInt();
        }
        for (int i = 0; i < nos.length; i++) {
            count=0;
            for (int k = i + 1; k < nos.length; k++) {
                if (nos[i] == nos[k]) {
                    count++;
                }


            }
            if (count == 0 || count % 2 != 0) {
                result++;
            }

        }
        System.out.println(result);
    }
}
