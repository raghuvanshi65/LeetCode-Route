class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int x = s1.length();
        int y = s2.length();
        int z = s3.length();
        if (x + y != z) return false;

        boolean dp[][] = new boolean[x + 1][y + 1];
        // dp array will be initialized with false

        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                if (i == 0 && j == 0)
                    dp[i][j] = true;
                else if (i == 0)
                    dp[i][j] = dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);
                else if (j == 0)
                    dp[i][j] = dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i - 1);
                else
                    dp[i][j] = (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1)) || (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1));
            }
        }
        return dp[x][y];
    }
}

