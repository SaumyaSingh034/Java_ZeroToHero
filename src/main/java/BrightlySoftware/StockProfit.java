package BrightlySoftware;

public class StockProfit {
    public static void main(String[] args) {
        int[] prices = {6, 3, 1, 2, 5, 4};
        int minProfit = getMinProfit(prices);
        System.out.println("Minimum possible profit: " + minProfit);
    }

    public static int getMinProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int minProfit = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            // Update the minimum price encountered so far
            minPrice = Math.min(minPrice, prices[i]);

            // Calculate the potential profit only if we sell after we buy (i.e., price[i] >= minPrice)
            int profit = prices[i] - minPrice;

            // Since we're looking for the minimum profit (not maximum)
            if (profit > 0) {
                minProfit = Math.min(minProfit, profit);
            }
        }

        return minProfit == Integer.MAX_VALUE ? 0 : minProfit; // If no valid profit found, return 0
    }
}