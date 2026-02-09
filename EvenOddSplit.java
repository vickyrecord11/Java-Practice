public class EvenOddSplit {

    public static void printEvenOdd(String str) {

        String even = "";
        String odd = "";

        for (int i = 0; i < str.length(); i++) {

            if (i % 2 == 0)
                even += str.charAt(i);
            else
                odd += str.charAt(i);
        }

        System.out.println(even + " " + odd);
    }

    public static void main(String[] args) {

        String s1 = "Hacker";
        String s2 = "Rank";

        printEvenOdd(s1);
        printEvenOdd(s2);
    }
}
