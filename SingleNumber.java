public class SingleNumber {
    public static int findSingleOccurenceNumber(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2 };
        int[] nums2 = { 1, 1, 2, 2, 3 };
        int[] nums3 = { 5, 2, 2 };

        System.out.println(findSingleOccurenceNumber(nums));
        System.out.println(findSingleOccurenceNumber(nums2));
        System.out.println(findSingleOccurenceNumber(nums3));
    }
}
