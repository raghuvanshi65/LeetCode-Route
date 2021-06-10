class Solution {
public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int sum = Integer.MAX_VALUE-1000;
        for(int i=0 ; i<n ; i++)
        {
            for(int j=i+1 ; j<n; j++){
                for(int k=j+1 ; k<n ; k++){
                    int sumLocal = nums[i]+nums[j]+nums[k];
                    if(Math.abs(sumLocal-target)<=Math.abs(sum-target))
                        sum = sumLocal;
                }
            }
        }
        return sum;
    }
}