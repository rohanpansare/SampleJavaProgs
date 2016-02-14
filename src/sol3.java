import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * Created by Rohan Pansare on 1/22/2016.
 */
public class sol3 {

    public static void main(String []argh)
    {
        Map<String,Integer> dict = new HashMap<String,Integer>( );
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            dict.put(name,phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            Integer a=dict.get(s);
            if(a==null){

                System.out.println("Not found");
            }
            else {
                System.out.println(s + "=" + dict.get(s));
            }

        }
    }
}
