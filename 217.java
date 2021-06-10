class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set1 = new HashSet<>();
        int len = nums.length;

        for (int i = 0 ; i < len ; i++) {
            set1.add(nums[i]);
            if (set1.size() < i + 1)
                return true;
        }

        return false;
    }
}