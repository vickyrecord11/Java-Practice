import java.util.HashSet;

public class RemoveDuplicatesAndAddNext {
    public static String removeDuplicates(String s) {

        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            while (set.contains(ch)) {
                ch++;
            }

            set.add(ch);
            result.append(ch);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s1 = "Java1234";
        String s2 = "python1223";

        System.out.println(removeDuplicates(s1));
        System.out.println(removeDuplicates(s2));

    }
}
