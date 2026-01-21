import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static int firstUniqChar(String s) {  

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (freq[ch - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        int result = firstUniqChar(s);

        System.out.println("Index of first non-repeating character: " + result);

        sc.close();
    }
}