import java.util.Stack;

public class BackSpacing {
    public static boolean backSpacing(String s, String t) {
        return buildString(s).equals(buildString(t));
    }

    public static String buildString(String str) {

        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {

            if (ch != '#') {

                stack.push(ch);
            }

            else {
                stack.pop();
            }
        }

        return stack.toString();

    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";

        String s2 = "ab##";
        String t2 = "c#d#";

        String s3 = "a#c";
        String t3 = "b";

        System.out.println(backSpacing(s, t));
        System.out.println(backSpacing(s2, t2));
        System.out.println(backSpacing(s3, t3));
    }
}
