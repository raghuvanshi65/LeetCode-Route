class Solution {
    private int climb(int stairs , int count , int [] arr) {
        if (stairs < 0)
            return count;
        if (arr[stairs] != -1) {
            return arr[stairs];
        }
        if (stairs <= 1) {
            return ++count;
        }

        arr[stairs] = climb(stairs - 1, count, arr) + climb(stairs - 2, count, arr);
        return arr[stairs];
    }


    public int climbStairs(int n) {
        int[] arr = new int[n + 1];
        Arrays.fill(arr, -1);
        return climb(n, 0 , arr);
    }
}