class Solution {
        public boolean canThreePartsEqualSum(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i : arr){
            sum += i;
        }

        int checker = sum/3;
        int values = 0;
        int count = 0;
        if(sum%3!=0)
            return false;
        for(int i=0 ; i<n ; i++){
            values += arr[i];
            if(values==checker){
                values = 0;
                count++;
            }
        }
        if(count>=3)
            return true;
        return false;
    }
}