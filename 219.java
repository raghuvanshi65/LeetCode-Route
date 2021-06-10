class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        Map<Integer , Integer> map1 = new HashMap<>();
        for (int i = 0 ; i < n ; i++) {
            if (map1.containsKey(nums[i])) {
                if (Math.abs(map1.get(nums[i]) - i) <= k)
                    return true;

            }
            map1.put(nums[i] , i);
        }
        return false;
    }
}