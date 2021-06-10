class Solution {
        public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i : nums) {
            if (hm.containsKey(i))
                hm.put(i, hm.get(i) + 1);
            else
                hm.put(i, 1);
        }

        Iterator<Map.Entry<Integer, Integer>> i1 = hm.entrySet().iterator();

        int count = 0;
        while (i1.hasNext()) {
            Map.Entry<Integer, Integer> mp = i1.next();
            if (mp.getValue() == 1)
                count += mp.getKey();
        }

        return count;
    }
}