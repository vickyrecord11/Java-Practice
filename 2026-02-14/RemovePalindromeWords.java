public class RemovePalindromeWords {
     public static void main(String[] args) {

        String sentence = "He did a good deed";

        System.out.println(removePalindromes(sentence));
    }

    public static String removePalindromes(String sentence) {

        String[] words = sentence.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {

            if (!isPalindrome(words[i])) {
                result = result + words[i] + " ";
            }
        }

        return result.trim();
    }

    public static boolean isPalindrome(String word) {

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {

            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}


