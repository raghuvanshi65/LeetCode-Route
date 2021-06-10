class Solution {
    public int minimumLength(String s) {

        int i = 0, j = s.length() - 1;
        while (j - i > 0) {
            char fr = s.charAt(i);
            char bk = s.charAt(j);

            if (fr == bk) {
                while (i < s.length() && s.charAt(i) == fr)
                    i++;
                while (j >= 0 && s.charAt(j) == bk)
                    j--;
            } else
                return j - i + 1;

        }

        return j == i ? 1 : 0;
    }
}