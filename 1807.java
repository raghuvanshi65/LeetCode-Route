class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder sb = new StringBuilder();
        HashMap<String, String> map = new HashMap<>();

        for (List<String> str : knowledge) {
            map.put(str.get(0), str.get(1));
        }

        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch == '(') {
                i++;
                StringBuilder key = new StringBuilder();
                while (i < s.length() && s.charAt(i) != ')') {
                    key.append(s.charAt(i));
                    i++;
                }
                sb.append(map.containsKey(key.toString()) ? map.get(key.toString()) : "?");
                i++;
                continue;
            }
            sb.append(ch);
            i++;

        }
        return sb.toString();
    }
}