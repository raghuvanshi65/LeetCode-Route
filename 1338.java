class Solution {
    public int minSetSize(int[] arr) {
        int len = arr.length;
        HashMap<Integer , Integer> hm = new HashMap<>();

        for (int i = 0 ; i < len ; i++)
            hm.put(arr[i] , hm.getOrDefault(arr[i] , 0) + 1);

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->b - a);
        pq.addAll(hm.values());

        int itr = 0 , sum = 0;
        for (Integer val : pq ) {
            sum = sum + val;
            itr++;
            if (sum >= len / 2)
                return itr;
        }
        return -1;

    }
}