class Solution {
       public int countVowelStrings(int n) {
        int arr[] = new int[5];
        Arrays.fill(arr , 1);
           
        for(int j=2 ; j<=n; j++)
        {
            for(int i=3 ; i>=0 ; i--)
                arr[i] += arr[i+1];
        }

        return Arrays.stream(arr).sum();
    }
}