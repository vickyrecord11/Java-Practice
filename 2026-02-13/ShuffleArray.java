import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArray {
    public static void shuffleRange(int start, int end) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            list.add(i);
        }

        Collections.shuffle(list);

        for (int nums : list) {
            System.out.print(nums + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        shuffleRange(1, 10);
        shuffleRange(5, 12);
        shuffleRange(1, 10);

        System.out.println("------");

        shuffleRange(1, 7);
        shuffleRange(1, 7);
        shuffleRange(1, 7);
        shuffleRange(1, 7);

    }
}
