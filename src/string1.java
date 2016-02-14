import java.util.Scanner;
public class string1 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String string=scanner.next();
        StringBuilder result = new StringBuilder();
        int count=0;
        char temp = 'a';
        for (int i=0;i<string.length();i++){
            if(count==0){
                 temp = string.charAt(i);
               count++;
            }
            else{
                if(temp != string.charAt(i)){
                    result.append(temp);

                    result.append(count);
                    temp=string.charAt(i);
                    count=1;

                }
                else
                {
                    count++;
                }
            }
        }
        if (count != 0) {
            result.append(temp);
            result.append(count);
        }
        System.out.println(result.toString());
    }
}