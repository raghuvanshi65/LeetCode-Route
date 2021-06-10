class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxLength = 0;
        int tagged = 0;

        for (int i = 0 ; i < nums.length ; i++) {
            if (i > 0 && nums[i] <= nums[i - 1])
                tagged = i;

            maxLength = Math.max(maxLength , i - tagged + 1);
        }

        return maxLength;
    }
}