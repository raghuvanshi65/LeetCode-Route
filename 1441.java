class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> li = new ArrayList<>();
        int n1 = target[target.length - 1];
        for (int i = 1 ; i <= n1 ; i++) {
            if (Arrays.binarySearch(target, i) > -1)
                li.add("Push");
            else {
                li.add("Push");
                li.add("Pop");
            }
        }
        return li;
    }
}