public class PrimeNumbers {

    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int n = 3;

        int count = 0;
        int number = 2;

        while (count < n) {

            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }

            number++;
        }
    }
}
