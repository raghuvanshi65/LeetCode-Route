class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        int len = nums.length;

        for (int i = 0 ; i < len ; i++)
            hm.put(nums[i], hm.getOrDefault(nums[i] , 0) + 1 );

        PriorityQueue<Map.Entry<Integer , Integer>> pq = new PriorityQueue<>((a, b)->b.getValue().compareTo(a.getValue()));
        pq.addAll(hm.entrySet());


        int[] arr = new int[k];
        for (int i = 0 ; i < k ; i++) {
            arr[i] = pq.poll().getKey();
        }

        return arr;
    }
}