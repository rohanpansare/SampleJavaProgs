package Sabre;

/**
 * Created by Rohan Pansare on 2/16/2016.
 */
public class braces {
    /*
 * Complete the function below.
 */
/*
    static String braces(String a) {
        Stack<Character> s = new Stack<Character>();
        for(int i=0;i<a.length();i++) {
            char c = a.charAt(i);
            if(c=='(' || c=='{' || c =='[') {
                s.push(c);
            }
            else if(c==')' || c=='}' || c==']') {
                if(s.isEmpty()) {
                    return "NO";
                }
                char temp = s.pop();
                if((temp=='(' && c!=')') || (temp=='[' && c!=']') || (temp=='{' &&
                        c!='}')) {
                    return "NO";
                }

            }
        }

        if(s.size()!=0) {
            return "NO";
        }
        return "YES";

    }

*/
}
