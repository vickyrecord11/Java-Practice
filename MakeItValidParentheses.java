import java.util.Stack;

public class MakeItValidParentheses {
    public static String makeItvalid(String s) {

        Stack<Character> result = new Stack<>();
        Stack<Integer> index = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                index.push(result.size());
                result.push(ch);
            } else if (ch == ')') {
                if (!index.isEmpty()) {
                    index.pop();
                    result.push(ch);
                }
            } else {
                result.push(ch);
            }
        }

        while (!index.isEmpty()) {
            int idx = index.pop();
            result.remove(idx);
        }
        StringBuilder ans = new StringBuilder();
        for (char c : result) {
            ans.append(c);
        }
        return ans.toString();
    }

    public static void main(String[] args) {

        String s1 = "lee(t(c)o)de)";
        String s2 = "a)b(c)d";
        String s3 = "))((";

        System.out.println("\"" + makeItvalid(s1) + "\"");
        System.out.println("\"" + makeItvalid(s2) + "\"");
        System.out.println("\"" + makeItvalid(s3) + "\"");
    }
}
