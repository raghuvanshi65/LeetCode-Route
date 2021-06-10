class Solution {
    public int minDeletions(String s) {
        int len  = s.length();
        int arr[] = new int[26];

        for (int i = 0 ; i < len ; i++)
            arr[s.charAt(i) - 'a']++;

        Arrays.sort(arr);

        Set<Integer> set1 = new HashSet<>();
        List<Integer> li = new ArrayList<>();


        for (int a : arr)
            if (a != 0)
                li.add(a);

        int size = li.size();
        int i = 0 , count = 0;

        while (set1.size() != size && i < li.size()) {
            int j = li.get(i);
            while (set1.contains(j) && j > 0) {
                j--;
                count++;
            }

            set1.add(j);
            i++;
        }
        return count;
    }
}