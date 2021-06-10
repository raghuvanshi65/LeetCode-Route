class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer ,Integer> mp = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++)
        {
            int comp = target - nums[i];
            if(mp.containsKey(comp)&&mp.get(comp)!=i)
            {
                return new int[] {mp.get(comp) , i};
            }
            mp.put(nums[i], i);
        }
        throw new IllegalArgumentException();    
    }
}