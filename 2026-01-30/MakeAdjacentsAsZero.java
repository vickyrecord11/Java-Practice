public class MakeAdjacentsAsZero {
    static void makeAdjacentZero(int[][] mat) {

        int M = mat.length;
        int N = mat[0].length;

        int[][] temp = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                temp[i][j] = mat[i][j];
            }
        }

        for (int i = 0; i < M - 1; i++) {
            for (int j = 0; j < N; j++) {

                if (temp[i][j] == 1) {

                     mat[i][j] = 0;

                    if (j + 1 < N)
                        mat[i][j + 1] = 0;

                    if (i + 1 < M)
                        mat[i + 1][j] = 0;

                    if (i - 1 >= 0)
                        mat[i - 1][j] = 0;

                    if (j - 1 >= 0)
                        mat[i][j - 1] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
                { 1, 0, 1 },
                { 0, 1, 0 },
                { 1, 1, 1 }
        };

        makeAdjacentZero(mat);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
