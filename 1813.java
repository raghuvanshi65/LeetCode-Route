class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        int n1 = sentence1.length();
        int n2 = sentence2.length();

        int l1 = 0, r1 = n1 - 1;
        int l2 = 0, r2 = n2 - 1;

        // match from left
        while (l1 < n1 && l2 < n2) {
            char c1 = sentence1.charAt(l1);
            char c2 = sentence2.charAt(l2);

            if (c1 != c2) break;

            l1++;
            l2++;
        }

        if (l1 == n1 && l2 == n2) return true;
        else if (l1 == n1) {
            if (sentence2.charAt(l2) == ' ') return true;
        } else if (l2 == n2) {
            if (sentence1.charAt(l1) == ' ') return true;
        }

        while (l1 > 0 && sentence1.charAt(l1 - 1) != ' ') l1--;
        while (l2 > 0 && sentence2.charAt(l2 - 1) != ' ') l2--;

        while (r1 >= l1 && r2 >= l2) {
            char c1 = sentence1.charAt(r1);
            char c2 = sentence2.charAt(r2);

            if (c1 != c2) break;

            r1--;
            r2--;
        }
        if (r1 < l1 && r2 < l2) return true;
        else if (r1 < l1) {
            if (sentence2.charAt(r2) == ' ') return true;
        } else if (r2 < l2) {
            if (sentence1.charAt(r1) == ' ') return true;
        }

        while (r1 < n1 - 1 && sentence1.charAt(r1 + 1) != ' ') r1++;
        while (r2 < n2 - 1 && sentence2.charAt(r2 + 1) != ' ') r2++;


        return l1 > r1 || l2 > r2;

    }
}