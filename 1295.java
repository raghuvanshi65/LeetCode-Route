class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int no : nums)
        {
            if(Integer.toString(no).length()%2==0)
            count++;
        }
        return count;
    }
}