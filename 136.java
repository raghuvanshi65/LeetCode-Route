class Solution {
    public int singleNumber(int[] nums) {
        int xor = nums[0] , len = nums.length;
        for(int i=1 ; i<len ; i++){
            xor ^= nums[i];
        }
        return xor;
    }
}