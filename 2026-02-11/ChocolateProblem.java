public class ChocolateProblem {

    public static void calculate(int money, int price, int wrappersNeeded,
            int chocoPerExchange, int maxVisit) {

        int chocolates = money / price;
        int wrappers = chocolates;
        int visits = 0;

        while (wrappers >= wrappersNeeded &&
                (maxVisit == 0 || visits < maxVisit)) {

            int newChocolates = (wrappers / wrappersNeeded) * chocoPerExchange;
            int remainingWrappers = wrappers % wrappersNeeded;

            chocolates += newChocolates;
            wrappers = newChocolates + remainingWrappers;

            visits++;
        }

        System.out.println("Total chocolates can eat: " + chocolates);
        System.out.println("Wrappers left in hand: " + wrappers);
    }

    public static void main(String[] args) {

        int money = 40;
        int price = 1;
        int wrappersNeeded = 3;
        int chocoPerExchange = 1;
        int maxVisit = 1;

        calculate(money, price, wrappersNeeded,
                chocoPerExchange, maxVisit);
    }
}
