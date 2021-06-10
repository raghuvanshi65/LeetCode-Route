class Solution {
    public int countGoodSubstrings(String s) {
        int len = s.length();
        int res = 0;
        Set<String> setGlobal = new HashSet<>();

        for (int i = 0 ; i <= len - 3 ; i++) {
            String sTemp = s.substring(i, i + 3);
            System.out.println(sTemp);

            Set<Character> setTemp = new HashSet<>();
            boolean dis = true;
            int j = 0;
            for (char ch : sTemp.toCharArray()) {
                setTemp.add(ch);
                j++;
                if (setTemp.size() != j) {
                    dis = false;
                    break;
                }
            }

            res += dis ? 1 : 0;
        }

        return res;
    }
}