class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();
        int len = arr.length;

        for (int i = 0 ; i < len ; i++) {
            if (!st.isEmpty()) {
                char ch = st.peek();
                if ((ch == '(' && arr[i] == ')') || (ch == '{' && arr[i] == '}') || (ch == '[' && arr[i] == ']'))
                    st.pop();
                else
                    st.push(arr[i]);
            } else
                st.push(arr[i]);
        }

        return st.isEmpty();
    }
}