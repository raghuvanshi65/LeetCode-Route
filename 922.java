class Solution {
public int[] sortArrayByParityII(int[] A) {
       int[] B = new int[A.length];

        for (int i = 0 ,  oddPointer = 1 ,evenPointer = 0 ; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                B[evenPointer] = A[i];
                evenPointer += 2;
            } else {
                B[oddPointer] = A[i];
                oddPointer += 2;
            }
        }
        return B;
    }
}