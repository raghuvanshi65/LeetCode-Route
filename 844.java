class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        int i = 0 , j = 0 , l1 = s.length() , l2 = t.length();
        while (i < l1 || j < l2) {
            if (i < l1) {
                char ch = s.charAt(i);
                if (ch != '#')
                    st1.push(ch);
                else if (!st1.isEmpty())
                    st1.pop();
                i++;
            } if (j < l2) {
                char ch = t.charAt(j);
                if (ch != '#')
                    st2.push(ch);
                else if (!st2.isEmpty())
                    st2.pop();
                j++;
            }
        }
        return st1.equals(st2);
    }
}