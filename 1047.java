class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> s = new Stack<Character>();
        for (int i = 0; i < S.length(); i++) {
            if (!s.empty() && s.peek() == S.charAt(i)) {
                s.pop();
            } else {
                s.push(S.charAt(i));
            }
        } String str = "";
        while (!s.empty()) {
            str = s.pop() + str;
        } return str;
    }
}