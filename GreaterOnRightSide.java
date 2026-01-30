public class GreaterOnRightSide {
    public static void greaterOnRight(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int max = -1;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
    }

    public static void main(String[] args) {

        int[] arr = { 16, 17, 4, 3, 5, 2 };

        greaterOnRight(arr);

        for (int var : arr) {
            System.out.print(var + " ");
        }

    }
}
