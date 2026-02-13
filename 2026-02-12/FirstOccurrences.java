public class FirstOccurrences {

    public static String findRange(String str1, String str2) {

        int minIndex = Integer.MAX_VALUE;
        int maxIndex = Integer.MIN_VALUE;

        for (int i = 0; i < str2.length(); i++) {

            char ch = str2.charAt(i);

            int index = str1.indexOf(ch);

            if (index == -1) {
                return "Invalid Input";
            }

            if (index < minIndex) {
                minIndex = index;
            }

            if (index > maxIndex) {
                maxIndex = index;
            }
        }

        return str1.substring(minIndex, maxIndex + 1);
    }

    public static void main(String[] args) {

        String str1 = "ZOHOCORPORATION";
        String str2 = "PORT";

        System.out.println(findRange(str1, str2));
    }
}
