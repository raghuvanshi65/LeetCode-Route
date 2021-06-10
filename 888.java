class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        Set<Integer> set = new HashSet<>();
        int sumA  = 0 , sumB = 0 , lenA = A.length , lenB = B.length;
        for (int i = 0 ; i < lenA ; i++) {
            set.add(A[i]);
            sumA += A[i];
        }

        for (int i = 0 ; i < lenB ; i++)
            sumB += B[i];

        for (int i = 0 ; i < lenB ; i++) {
            int temp = (sumA - sumB + 2 * B[i]) / 2;
            if (set.contains(temp))
                return new int[] {temp , B[i]};
        }
        return null;
    }
}