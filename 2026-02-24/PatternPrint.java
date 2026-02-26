public class PatternPrint {

    public static void printPattern(int N, int M) {

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < M; j++) {

                if (i == 0 || i == N - 1 || j == 0 || j == M - 1) {
                    System.out.print("X ");
                }

                else if (N >= 6 && M >= 7) {

                    if (j == 1 || j == M - 2) {
                        System.out.print("0 ");
                    } else if (i >= 2 && i <= N - 3 && j >= 2 && j <= M - 3) {
                        System.out.print("X ");
                    } else {
                        System.out.print("0 ");
                    }
                }

                else {
                    System.out.print("0 ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        printPattern(3, 3);
        System.out.println();

        printPattern(4, 5);
        System.out.println();

        printPattern(6, 7);
    }
}
