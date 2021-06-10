class Solution {
    public boolean closeStrings(String word1, String word2) {
        int n1 = word1.length(), n2 = word2.length();
        if(n1 != n2) return false;
        int ar[] = new int[26], br[] = new int[26];
        for(char val: word1.toCharArray()) ar[val - 'a']++;
        for(char val: word2.toCharArray()) br[val - 'a']++;
        for(int val: ar){
			if(val == 0) continue;
            boolean found = false;
            for(int i=0; i<26; i++){
                if(br[i] == val && ar[i] > 0){
                    found = true;
                    br[i] = 0;
                    break;
                }
            }
            if(!found) return false;
        }
        return true;
    }
}