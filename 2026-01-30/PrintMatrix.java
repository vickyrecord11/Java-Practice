public class PrintMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int[] var : mat) {
            System.out.print(var + " ");
        }
    }
}
