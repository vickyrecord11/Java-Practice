import java.util.*;

public class LongestSequence {
    public static int printLongestSequence(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (!map.containsKey(ch)) {
                map.put(ch, i);
            } else {
                int len = i - map.get(ch) - 1;
                max = Math.max(len, max);
            }
        }
        return max;
    }

    public static void main(String[] args) {

        String s1 = "abcccccbba";
        String s2 = "aaaaaaaa";

        System.out.println(printLongestSequence(s1));
        System.out.println(printLongestSequence(s2));
    }
}
