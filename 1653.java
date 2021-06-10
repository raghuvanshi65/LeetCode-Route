class Solution {
    public int minimumDeletions(String s) {
        int a = s.chars().map(i -> i == 'a' ? 1 : 0).sum();
        int cnt = a, b = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'b') {
                cnt = Math.min(cnt, a + b++);
            } else {
                --a;
            }
        }
        return Math.min(cnt, b);
    }
}