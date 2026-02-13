public class PangramCheck {
    public static boolean isPangram(String s) {

        s = s.toLowerCase();

        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (!alphabet[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String input1 = "abc defGhi JklmnOP QRStuv wxyz";
        String input2 = "abc defGhi JklmnOP QRStuv";

        System.out.println(isPangram(input1));
        System.out.println(isPangram(input2));

    }
}
