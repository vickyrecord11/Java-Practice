public class SortByFactors {

    public static int countFactors(int num) {

        int count = 0;

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = { 8, 2, 3, 12, 16 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1; j++) {

                int count1 = countFactors(arr[j]);
                int count2 = countFactors(arr[j + 1]);

                if (count1 < count2) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
