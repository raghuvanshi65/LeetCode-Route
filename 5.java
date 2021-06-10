public class Solution {
    private static int dp[][] ;

    private static String getCommonSubString(String s1 , String s2) {
        int r = s1.length() + 1 , c = s2.length() + 1;
        dp = new int[r][c];
        Arrays.fill(dp[0], 0);
        for (int i = 0; i < r ; i++)
            dp[i][0] = 0;

        int max = -1 , r1 = -1 , c1 = -1;
        for (int i = 1 ; i < r ; i++) {
            for (int j = 1 ; j < c ; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                if (dp[i][j] > max) {
                    max = dp[i][j];
                    r1 = i;
                    c1 = j;
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        while (dp[r1][c1] != 0) {
            sb.append(s1.charAt(r1 - 1));
            r1--;
            c1--;
        }

        return sb.reverse().toString();
    }

    public String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        return  getCommonSubString(s, sb.reverse().toString());
    }
}