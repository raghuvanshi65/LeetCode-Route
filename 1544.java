class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0 ; i < s.length() ; i++) {
            if (!st.isEmpty() && Math.abs((int)s.charAt(i) - (int)st.peek()) == 32)
                st.pop();
            else
                st.push(s.charAt(i));

        }

        String re = "";
        for (char c : st)
            re = re + c;

        return re;
    }

}