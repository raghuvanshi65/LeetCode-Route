class Solution {
    public int findKthPositive(int[] arr, int k) {
        for (int i = 1, counter = 0, index = 0; i <= Integer.MAX_VALUE && counter != k; i++) {
            if (index < arr.length && arr[index] == i)
                index++;
            else
                counter++;
            if (counter == k)
                return i;
        }
        return 0;
    }
}