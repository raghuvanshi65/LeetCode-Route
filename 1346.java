class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set1 = new HashSet<>();
        int n = arr.length;
        for (int i = 0 ; i < n ; i++) {
            set1.add(arr[i]);
            if (arr[i] != 0) {
                if (set1.contains(arr[i] * 2))
                    return true;
                if (arr[i] % 2 == 0 && set1.contains(arr[i] / 2))
                    return true;
            } else if (set1.size() - 1 != i)
                return true;
        }
        return false;
    }

}