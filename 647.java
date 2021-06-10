class Solution {
    public int expandFrom(int l , int r , String s) {
        int count = 0;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            count++;
            l--;
            r++;
        }
        return count;
    }


    public int countSubstrings(String s) {
        int counter = 0;
        for (int i = 0 ; i < s.length() ; i++) {
            int j = expandFrom(i , i  , s );
            int k =  expandFrom(i , i + 1, s);
            counter += j;
            counter += k;
        }
        return counter;
    }

}