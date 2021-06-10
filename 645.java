class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[] = new int[2];
        int arr[] = new int[nums.length + 1];

        for (int i = 0 ; i < nums.length ; i++) {
            arr[nums[i]]++;
        }

        for (int i = 0 ; i < arr.length ; i++) {
            if (i != 0 && arr[i] == 0)
                ans[1] = i;
            if (arr[i] == 2)
                ans[0] = i;
        }
        return ans;
    }
}