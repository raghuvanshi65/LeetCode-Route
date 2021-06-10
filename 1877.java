class Solution {
    public int minPairSum(int[] nums) {
        int len = nums.length;
        if(len<=2)
            return nums[0]+nums[1];
        Arrays.sort(nums);
        
        int i = (len-1)/2 ;
        int j = i+1 , max = -1;
        while(i>=0&&j<len){
            max = Math.max(max , nums[i--]+nums[j++]);
        }
        
        return max;
    }
}