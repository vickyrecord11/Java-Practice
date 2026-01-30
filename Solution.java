public class Solution {
    public static int rotate(int[] nums) {
        int n = nums.length;
        int max = 0;
        int i;

        for (i = 0; i < n; i++) {
            if (nums[i] < nums[i + 1]) {
                nums[i] = nums[i + 1];
            } else if (nums[i] > nums[i + 1]) {
                nums[i] = -1;
            }

        }
        return nums[i] + Math.max(nums[i], max);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 2 };

        System.out.println(rotate(nums));
    }
}
