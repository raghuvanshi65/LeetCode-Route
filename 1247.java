class Solution {
    public int minimumSwap(String s1, String s2) {
        int countX = 0 , countY = 0;
        int len1 = s1.length() , len2 = s2.length();

        for (int i = 0 ; i < len1 ; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (s1.charAt(i) == 'x')
                    countX++;
                else
                    countY++;
            }
        }

        if ((countX + countY) % 2 != 0)
            return -1;

        int ans = countX / 2 + countY / 2;
        if (countX % 2 != 0)
            ans += 2;

        return ans;
    }
}