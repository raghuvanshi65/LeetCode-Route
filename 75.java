class Solution {
    public void sortColors(int[] nums) {
        int no_0 = 0 , no_1 = 0 , no_2 = 0;
        for (int n : nums) {
            if (n == 0)
                no_0++;
            else if (n == 1)
                no_1++;
            else
                no_2++;
        }

        int len = nums.length;
        for (int i = 0 ; i < len ; i++) {
            if (no_0 > 0) {
                nums[i] = 0;
                no_0--;
            } else if (no_1 > 0) {
                nums[i] = 1;
                no_1--;
            } else {
                nums[i] = 2;
                no_2--;
            }
        }
    }
}