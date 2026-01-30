import java.util.*;

public class SingleNumberByHashMap {
    public static int findSingleNumberByHashMap(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2 };
        int[] nums2 = { 1, 1, 2, 2, 3 };
        int[] nums3 = { 5, 2, 2 };

        System.out.println(findSingleNumberByHashMap(nums));
        System.out.println(findSingleNumberByHashMap(nums2));
        System.out.println(findSingleNumberByHashMap(nums3));
    }
}
