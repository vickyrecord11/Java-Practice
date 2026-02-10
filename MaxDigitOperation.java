import java.util.*;

public class MaxDigitOperation {

    public static int computeMax(int num) {

        int sum = 0;
        int product = 1;

        int temp = num;

        if (num == 0)
            return 0;

        while (temp > 0) {

            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        return Math.max(sum, product);
    }

    public static void main(String[] args) {

        int[] arr = { 120, 24, 71, 10, 59 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(computeMax(arr[i]) + " ");
        }
    }
}