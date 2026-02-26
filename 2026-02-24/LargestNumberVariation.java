import java.util.*;

public class LargestNumberVariation {

    public static void main(String[] args) {

        int[] arr = { 54, 546, 548, 60 };

        String[] numbers = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            numbers[i] = String.valueOf(arr[i]);
        }

        Arrays.sort(numbers, (a, b) -> (b + a).compareTo(a + b));

        if (numbers[0].equals("0")) {
            System.out.println("0");
            return;
        }

        StringBuilder result = new StringBuilder();

        for (String num : numbers) {
            result.append(num);
        }

        System.out.println(result);
    }
}