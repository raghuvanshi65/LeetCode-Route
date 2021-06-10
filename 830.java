class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> finalList = new ArrayList<>();
        for (int i = 0 ; i < s.length() ; ) {
            List<Integer> local = new ArrayList<>();
            char c = s.charAt(i);
            int j = i + 1;
            while (j < s.length() && s.charAt(j) == c) {
                j = j + 1;
            }


            if (j - i >= 3) {
                local.add(i);
                local.add(j - 1);
                finalList.add(local);
            }
            i = j;
        }

        return finalList;
    }
}