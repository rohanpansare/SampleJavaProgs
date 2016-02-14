package HackerrankCollections;

/**
 * Created by Rohan Pansare on 2/6/2016.
 */
public class godaddy {

    static int[] mergeArrays(int[] a, int[] b) {
        int i = a.length -1;
        int j = b.length -1;
        int k = a.length+b.length - 1;
        int[] result = new int[k + 1];
        while (k >= 0 && i>=0 && j>=0) {
            if (a[i] > b[j])
                result[k--] = a[i--];
            else
                result[k--] = b[j--];
        }
        while(i >= 0){
            result[k--] = a[i--];
        }
        while(j >= 0){
            result[k--] = b[j--];
        }
        return result;
    }
}
