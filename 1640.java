class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, int[]> hs = new HashMap<>();
        for (int i = 0; i < pieces.length; i++)
            hs.put(Integer.valueOf(pieces[i][0]), pieces[i]);

        int i = 0;
        while (i < arr.length) {
            if (hs.containsKey(arr[i])) {
                int length = hs.get(arr[i]).length;

                if (Arrays.equals(arr, i, i + length, hs.get(arr[i]), 0, length))
                    i += length;
                else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}