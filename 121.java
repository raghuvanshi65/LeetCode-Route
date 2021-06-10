class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxDiff = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] <= min)
                min = prices[i];
            if (maxDiff <= prices[i] - min)
                maxDiff = prices[i] - min;
        }

        return maxDiff;
    }
}