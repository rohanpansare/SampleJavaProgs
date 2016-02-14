import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**
 * Created by Rohan Pansare on 1/29/2016.
 */
public class dupstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println(string);
        char[] charArray = string.toCharArray();
        List<Character> list = new ArrayList<Character>();
        for (Character c : charArray
                ) {
            if (list.contains(c)) {
                System.out.println("First Duplicate found "+ c);
                break;
            }
            else
                list.add(c);
        }
    }
}
