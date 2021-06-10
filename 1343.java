class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int cnt = 0 , s = 0;  // s for sum of sliding window, cnt for count
        int t = k * threshold; // t is the min sum for subarr of k len sliding window
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];  // accumulative sum adding head
            if (i < k - 1) continue;  // wait until threshhold.
            if (i > k - 1) s -= arr[i - k];  // accumulative sum substract tail
            if (s >= t) cnt++;  // found one
        }
        return cnt;
    }
}