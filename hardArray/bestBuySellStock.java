package hardArray;

public class bestBuySellStock {

    public static void main(String[] args) {

        int[] prices = { 7, 1, 5, 3, 6, 4 };

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i]  < minPrice) {
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        System.out.println("Maximum Profit: " + maxProfit);
    }
}