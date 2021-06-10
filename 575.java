class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set1 = new HashSet<>();
        for (int i : candyType)
            set1.add(i);

        int size = set1.size();
        return size >= candyType.length / 2 ?  candyType.length / 2 : size;
    }
}