class Solution {
    public int[] sortByBits(int[] arr) {
        Integer arr1[] = IntStream.of(arr).boxed().toArray(Integer[] :: new);
        Arrays.sort(arr1, (i, j)-> {
            int ibit = Integer.bitCount((int) i);
            int jbit = Integer.bitCount((int) j);
            if (ibit - jbit == 0)
                return i - j;
            else
                return ibit - jbit;
        });

        for (int i = 0 ; i < arr1.length ; i++)
            arr[i] = arr1[i];
        return arr;
    }
}