class Solution {

    private static int arr[] = new int[37];

    public static int tribonacci(int n) {
        if (n == 0)
            return 0;

        if (n == 2 || n == 1)
            return 1;
        if (arr[n - 1] == 0)
            arr[n - 1] = tribonacci(n - 1);

        if (arr[n - 2] == 0)
            arr[n - 2] = tribonacci(n - 2);

        if (arr[n - 3] == 0)
            arr[n - 3] = tribonacci(n - 3);

        return arr[n - 1] + arr[n - 2] + arr[n - 3];
    }

}