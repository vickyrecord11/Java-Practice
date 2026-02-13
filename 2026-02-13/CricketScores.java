import java.util.*;

public class CricketScores {
    public static void calculateScores(String inputs) {

        String[] events = inputs.split(" ");

        int p1 = 0;
        int p2 = 0;
        int extras = 0;

        int ballCount = 0;
        int currentPlayer = 1;

        for (int i = 0; i < events.length; i++) {

            String event = events[i];

            if (event.equals("W") || event.equals("N")) {
                extras++;
                continue;
            }

            ballCount++;

            if (!event.equals(".")) {

                int runs = Integer.parseInt(event);

                if (currentPlayer == 1) {
                    p1 += runs;
                } else {
                    p2 += runs;
                }

                if (runs % 2 == 1) {
                    currentPlayer = (currentPlayer == 1) ? 2 : 1;
                }
            }

            if (ballCount == 6) {
                currentPlayer = (currentPlayer == 1) ? 2 : 1;
                ballCount = 0;
            }
        }
        System.out.println("P1 : " + p1);
        System.out.println("P2 : " + p2);
        System.out.println("Extras : " + extras);
    }

    public static void main(String[] args) {

        String inputs = "1 . 2 . 4 3 6 W 1 . N . 2 1";

        calculateScores(inputs);

    }
}
