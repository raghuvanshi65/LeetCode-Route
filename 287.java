class Solution {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0 ; i < len ; i++) {
            set1.add(nums[i]);
            if (set1.size() != i + 1)
                return nums[i];
        }
        return 0;
    }
}