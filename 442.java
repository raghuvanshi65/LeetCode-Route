class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set1 = new HashSet<>();
        int length = nums.length;
        List<Integer> li = new ArrayList<>();
        for(int i : nums){
            int size = set1.size();
            set1.add(i);
            if(set1.size()==size)
                li.add(i);
        }

        return li;
    }
}