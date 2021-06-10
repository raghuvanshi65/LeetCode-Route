class Solution {
    public int maxProfit(int[] prices, int fee) {

        int n = prices.length, ans = 0, last = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            last = Math.max(last, ans - prices[i]);
            ans = Math.max(ans, last + prices[i] - fee);
        }
        return Math.max(last, ans);


    }
}