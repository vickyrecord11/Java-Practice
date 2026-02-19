public class EqualSumIndex {
    public static int equalSum(int[] arr) {

        int n = arr.length;

        int totalCount = 0;
        int rightSide = 0;
        int leftSide = 0;

        for (int i = 0; i < n; i++) {
            totalCount += arr[i];
        }

        for (int i = 0; i < n; i++) {
            rightSide = totalCount - leftSide - arr[i];

            if (rightSide == leftSide) {
                return arr[i];

            }
            leftSide += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 7, 6 };
        System.out.println(equalSum(nums));
    }
}
