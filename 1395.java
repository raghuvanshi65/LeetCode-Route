class Solution {
    public int numTeams(int[] rating) {
        int countTeam = 0;
        int len = rating.length;
        for (int i = 1 ; i < len - 1 ; i++) {
            int inc1 = 0 , inc2 = 0 , dec1 = 0 , dec2 = 0;
            for (int j = 0 ; j < len ; j++) {
                if (j < i) {
                    if (rating[j] < rating[i])
                        inc1++;
                    else
                        dec1++;
                }
                if (j > i) {
                    if (rating[j] > rating[i])
                        inc2++;
                    else
                        dec2++;
                }
            }
            countTeam += (inc1 * inc2);
            countTeam += (dec1 * dec2);
        }
        return countTeam;
    }
}