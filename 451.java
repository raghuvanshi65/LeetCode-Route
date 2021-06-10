import java.util.Hashtable;

class Solution {

    private class CustomData {
        public char ch;
        public int freq;

        public CustomData(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }
    }

    public String frequencySort(String s) {
        int len = s.length();
        int[] arr = new int[128];
        for (int i = 0 ; i < len ; i++)
            arr[(int)s.charAt(i)]++;

        List<CustomData> li = new ArrayList<>();
        for (int j = 0; j < 128 ; j++)
            li.add(new CustomData((char)j , arr[j] ));


        li.sort(new Comparator<CustomData>() {
            @Override
            public int compare(CustomData o1, CustomData o2) {
                return o2.freq - o1.freq;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (CustomData cd : li) {
            int j = cd.freq;
            while (j-- > 0)
                sb.append(cd.ch);
        }

        return sb.toString();
    }
}