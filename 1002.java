class Solution {
       public List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();
        int[] arrFinal = new int[26];

        for (char c : A[0].toCharArray())
            arrFinal[c - 'a']++;

        for (int i = 0; i < A.length; i++) {
            int[] arrBlock = new int[26];
            for (char ch : A[i].toCharArray())
                arrBlock[ch - 'a']++;
            for (int j = 0; j < 26; j++)
                arrFinal[j] = Math.min(arrFinal[j], arrBlock[j]);
        }

        for (int i = 0; i < 26; i++) {
            while (arrFinal[i]-- > 0)
                list.add(Character.toString(i + 'a'));
        }

        return list;
    }
}