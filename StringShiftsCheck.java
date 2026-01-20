public class StringShiftsCheck {
    public static boolean stringShifts(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }
        if (s.equals(goal)) {
            return true;
        }

        for (int i = 0; i < s.length(); i++) {

            s = s.substring(1) + s.charAt(0);

            if (s.equals(goal)) {
                return true;
            }

        }
        return false;

    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        String s1 = "abcde";
        String goal1 = "abced";

        System.out.println(stringShifts(s, goal));
        System.out.println(stringShifts(s1, goal1));

    }
}
