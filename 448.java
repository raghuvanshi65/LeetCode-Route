class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len + 1];
        List<Integer> li = new ArrayList<>();

        for (int num : nums) arr[num]++;

        for (int i = 1 ; i < len + 1 ; i++) {
            if (arr[i] == 0)
                li.add(i);
        }

        return li;
    }
}