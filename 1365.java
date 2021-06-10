class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int freq[] = new int[101];
        int arr[] = new int[nums.length];

        for(int num : nums)
        freq[num]++;

        for(int i=1 ; i<freq.length ; i++)
        freq[i] += freq[i-1];

        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i]==0)
            arr[i] = 0;
            else
                arr[i] = freq[nums[i]-1];
        }

        return arr;
    }
}