import java.util.Scanner;
/**
 * Created by Rohan Pansare on 1/26/2016.
 */
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Day20Hackerrankcode {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();
        String[] result = string1.trim().split("([^a-zA-Z])+");
        System.out.println(result.length);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);

        }
    }
}
