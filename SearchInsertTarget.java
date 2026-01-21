public class SearchInsertTarget {
    public static int searchTargetIndex(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;

        int[] nums2 = { 1, 3, 5, 6 };
        int target2 = 2;

        int[] nums3 = { 1, 3, 5, 6 };
        int target3 = 7;

        System.out.println(searchTargetIndex(nums, target));
        System.out.println(searchTargetIndex(nums2, target2));
        System.out.println(searchTargetIndex(nums3, target3));
    }
}
