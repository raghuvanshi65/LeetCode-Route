class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum = 0 , len = costs.length;
        for (int i = 0 ; i < len ; i++) {
            sum += costs[i];

            if (sum == coins)
                return i + 1;
            if (sum > coins)
                return i;
        }
        return len;
    }
}