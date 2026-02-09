import java.util.*;

public class AlternateSort {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            if (left != right) {
                System.out.print(arr[right--] + " ");
                System.out.print(arr[left++] + " ");
            } else {
                System.out.print(arr[left++] + " ");
            }
        }
    }
}
