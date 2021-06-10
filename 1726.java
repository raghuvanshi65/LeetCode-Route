class Solution {
    public int tupleSameProduct(int[] nums) {
        int ans = 0;
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            long x = nums[i] * 1;
            for (int j = i + 1; j < nums.length; j++) {
                long y = x * nums[j];
                map.put(y, map.getOrDefault(y, 0) + 1);
            }
        }
        for (long num : map.keySet()) {
            if (map.get(num) > 1) {
                int freq = map.get(num);
                ans += freq * (freq - 1) * 4;
            }
        }
        return ans;
    }
}