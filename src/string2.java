import java.util.HashMap;
public class string2 {
    public static void main(String[] args) {
        String s = "aaabbbccddcccc";
        HashMap<Character, Integer> h = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (h.containsKey(s.charAt(i))) {
                h.put(s.charAt(i), h.get(s.charAt(i)) + 1);
            } else h.put(s.charAt(i), 1);
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            boolean b = true;
            for (int j = 0; j < sb.length(); j++) {
                if (s.charAt(i) != sb.charAt(j)) {
                } else b = false;
            }
            if (b == true) {
                sb.append(s.charAt(i));
                sb.append(h.get(s.charAt(i)));
            }
        }
        System.out.println(sb);
    }
}