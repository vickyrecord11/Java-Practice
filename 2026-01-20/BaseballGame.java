import java.util.*;

public class BaseballGame {
    public static int points(String[] ops) {

        Stack<Integer> record = new Stack<>();

        for (String s : ops) {
            if (s.equals("C")) {
                record.pop();
            } else if (s.equals("D")) {
                record.push(record.peek() * 2);
            } else if (s.equals("+")) {
                int last = record.pop();
                int secondLast = record.peek();
                int sum = last + secondLast;

                record.push(last);
                record.push(sum);
            } else {
                record.push(Integer.parseInt(s));
            }
        }
        int totalSum = 0;
        for (int score : record) {
            totalSum += score;
        }
        return totalSum;
    }

    public static void main(String[] args) {
        String[] ops = { "5", "2", "C", "D", "+" };
        String[] ops1 = {"5","-2","4","C","D","9","+","+"};
        String[] ops2 = {"1","C"};
        System.out.println(points(ops));
        System.out.println(points(ops1));
        System.out.println(points(ops2));
    }
}