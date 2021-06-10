class Solution {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int arr[] = new int[length + 1];
        for (int i = 0 ; i < length ; i++)
            arr[nums[i]]++;

        for (int i = 0 ; i < length + 1 ; i++)
            if (arr[i] == 0)
                return i;

        return 0;
    }
}