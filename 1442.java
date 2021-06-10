class Solution {
    public int countTriplets(int[] arr) {
        int length = arr.length;
        int countTriplets = 0;
        for (int i = 0; i < length; i++) {
            int xor = arr[i];
            for (int j = i + 1; j < length; j++) {
                xor ^= arr[j];
                if (xor == 0)
                    countTriplets += j - i ;
            }
        }
        return countTriplets;
    }
}