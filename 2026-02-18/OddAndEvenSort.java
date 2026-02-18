import java.util.*;

public class OddAndEvenSort {
    public static void oddEvenSort(int[] nums) {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        int[] odds = new int[odd];
        int[] evens = new int[even];

        int o = 0, e = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                evens[e++] = num;
            } else {
                odds[o++] = num;
            }
        }
        Arrays.sort(odds);
        Arrays.sort(evens);

        for (int num : odds) {
            System.out.print(num + " ");
        }
        for (int i = evens.length - 1; i >= 0; i--) {
            System.out.print(evens[i] + " ");
        }

    }

    public static void main(String[] args) {

        int[] nums = { 5, 8, 11, 6, 2, 1, 7 };
        oddEvenSort(nums);
    }
}