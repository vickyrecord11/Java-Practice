
public class AddDigitToNumber {

    public static String addDigit(int digit, int number) {

        String result = "";

        while (number > 0) {

            int lastDigit = number % 10;
            int sum = lastDigit + digit;

            result = sum + result;

            number = number / 10;
        }

        return result;
    }

    public static void main(String[] args) {

        int digit = 4;
        int number = 2875;

        System.out.println(addDigit(digit, number));
    }
}
