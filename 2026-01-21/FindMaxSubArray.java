public class FindMaxSubArray {
    public static int maxSubArray(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int[] arr2 = { 1 };
        int[] arr3 = { 5, 4, -1, 7, 8 };

        System.out.println(maxSubArray(arr));
        System.out.println(maxSubArray(arr2));
        System.out.println(maxSubArray(arr3));
    }
}
