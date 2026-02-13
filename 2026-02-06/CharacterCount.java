public class CharacterCount {
    public static String characterCount(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < s.length(); i++) {

            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                sb.append(s.charAt(i));
                sb.append(count);
                count = 1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String s = "aaabbcdd";

        System.out.println(characterCount(s));
    }
}
