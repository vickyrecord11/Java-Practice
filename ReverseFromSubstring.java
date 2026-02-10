public class ReverseFromSubstring {

    public static String reverseFromSubstring(String str1, String str2) {

        String[] words = str1.split(" ");
        int index = -1;

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(str2)) {
                index = i;
                break;
            }
        }

        if (index == -1)
            return str1;

        int left = index;
        int right = words.length - 1;

        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            result.append(words[i]);
            if (i != words.length - 1)
                result.append(" ");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str1 = "This is a test String only";
        String str2 = "st";
        System.out.println(reverseFromSubstring(str1, str2));
    }
}

