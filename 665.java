class Solution {
   public boolean checkPossibility(int[] nums){
        int counter = 0 , len = nums.length;
        for(int i=1 ; i<len ; i++)
        {
            if(nums[i]<nums[i-1]){
                if(i==1||nums[i-2]<=nums[i]) {
                    nums[i - 1] = nums[i];
                    counter++;
                }
                else{
                    nums[i] = nums[i-1];
                    counter++;
                }
            }
        }
        return counter<=1;
    }
}