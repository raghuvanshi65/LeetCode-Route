class Solution {
    public int maxProduct(int[] nums) {
        int maxOverall = nums[0] , minSoFar = nums[0] , maxSoFar = nums[0] , max = nums[0];
        for (int i = 1 ; i < nums.length ; i++) {
            max = maxSoFar;
            maxSoFar = Math.max(nums[i] , Math.max(nums[i] * maxSoFar, nums[i] * minSoFar));
            minSoFar = Math.min(nums[i] , Math.min(nums[i] * minSoFar , nums[i] * max));

            maxOverall = Math.max(maxOverall , maxSoFar);
        }

        return maxOverall;
    }
}