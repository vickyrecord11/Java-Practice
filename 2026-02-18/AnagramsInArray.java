import java.util.*;

public class AnagramsInArray {

    public static String sortWord(String word) {
        char[] arr = word.toLowerCase().toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public static void main(String[] args) {

        String[] words = { "catch", "got", "tiger", "mat", "eat", "Pat", "tap", "tea" };
        String target = "ate";

        String sortedTarget = sortWord(target);

        for (String word : words) {
            if (sortWord(word).equals(sortedTarget)) {
                System.out.print(word + " ");
            }
        }
    }
}
