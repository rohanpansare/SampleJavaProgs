/**
 * Created by Rohan Pansare on 2/12/2016.
 */
public class zappos3 {
    /*
 * Complete the function below.
 */

    static void mystery(String[] letter) {
        for(int i =0;i<letter.length;i++){
            int count=0 ;
            String word=letter[i];
           int  begin  = 0;
           int  end    = word.length() - 1;
            int middle = (begin + end)/2;

            for (i = begin; i <= middle; i++) {
                if (word.charAt(begin) == word.charAt(end)) {
                    begin++;
                    end--;
                }
                else {
                    break;
                }
            }
            if (i == middle + 1) {
                System.out.println(count);
            }
            if(word.charAt(begin)!=word.charAt(end)){
                char s2= word.charAt(end);
              //  word = (char) (word.charAt(end)+1);
            }

//            for(int j=0,k=letter.length;j<letter.length && k>=0;j++,k--){
//                if(word[j]==word[k]){
//
//                }
//            }

        }

    }

    public static void main(String[] args) {
        String[] s ={"ab","abbc"};
        mystery(s);
    }

}
