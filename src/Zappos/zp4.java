package Zappos;

/**
 * Created by Rohan Pansare on 2/12/2016.
 */
public class zp4 {

    static String isitpossible(int a, int b, int c, int d)
    {
        if((a==c && b==d))
            return "Yes";
        else if((a>c && a>d) || (b>c && b>d))
            return "No";
        else if("Yes".equals(isitpossible(a+b, b, c, d)) || "Yes".equals(isitpossible(a, a+b, c, d)))
            return "Yes";
        else
            return "No";
    }
}
