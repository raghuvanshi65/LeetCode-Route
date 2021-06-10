class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char c1 = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = c1;
        }
    }
}