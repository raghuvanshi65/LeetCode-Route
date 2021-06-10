class Solution {
    public String removeOuterParentheses(String S) {        
        Stack<Character> st = new Stack<>();
        String re = "";
        int start = 0;
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == '(') {
                st.push(S.charAt(i));
            }
            else if(S.charAt(i) == ')') {
                st.pop();
                
            }
            if(st.isEmpty()) {
                re = re + S.substring(start+1, i);
                start = i+1;
            }
        }
        return re;
    }
}