public class DateDifference {

    public static void main(String[] args) {

        int d1 = 10, m1 = 2, y1 = 2014;
        int d2 = 10, m2 = 3, y2 = 2015;

        int result = countDays(d1, m1, y1, d2, m2, y2);

        System.out.println("Total days = " + result);
    }

    public static int countDays(int d1, int m1, int y1,
            int d2, int m2, int y2) {

        int days = 0;

        while (!(d1 == d2 && m1 == m2 && y1 == y2)) {

            d1++;
            days++;

            if (d1 > daysInMonth(m1, y1)) {
                d1 = 1;
                m1++;
            }

            if (m1 > 12) {
                m1 = 1;
                y1++;
            }
        }

        return days;
    }

    public static int daysInMonth(int month, int year) {

        if (month == 2) {
            if (isLeap(year)) {
                return 29;
            } else {
                return 28;
            }
        }

        if (month == 4 || month == 6 ||
                month == 9 || month == 11) {
            return 30;
        }

        return 31;
    }

    public static boolean isLeap(int year) {

        if (year % 400 == 0)
            return true;

        if (year % 4 == 0 && year % 100 != 0)
            return true;

        return false;
    }
}
