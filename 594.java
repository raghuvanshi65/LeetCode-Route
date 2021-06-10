class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> h1 = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (h1.containsKey(nums[i]))
                h1.put(nums[i], h1.get(nums[i]) + 1);
            else {
                h1.put(nums[i], 1);
            }

        }

        int maxi = 0;
        for (Integer key : h1.keySet()) {
            if (h1.containsKey(key - 1) && h1.get(key) + h1.get(key - 1) > maxi) {
                maxi = h1.get(key) + h1.get(key - 1);
            }
        }

        return maxi;
    }
}