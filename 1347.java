class Solution {
    public int minSteps(String s, String t) {
        int arr[] = new int[26] , len1 = s.length() , count = 0;
        for (int i = 0 ; i < len1 ; i++)
            arr[s.charAt(i) - 'a']++;

        for (int i = 0 ; i < len1 ; i++) {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            if (arr[t1 - 'a'] == 0) {
                count++;
                arr[t1 - 'a']--;
            } else if (arr[t1 - 'a'] > 0)
                arr[t1 - 'a']--;
        }

        for (int i = 0 ; i < 26 ; i++)
            count += arr[i];

        return count;
    }
}