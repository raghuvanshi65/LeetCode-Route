class Solution {
        public int[] sumZero(int n) {
        int[] arr = new int[n];
        if(n%2==0)
        {   
            int val = 1;
            for(int i=0 ; i<n/2 ; i++)
            {
                arr[i] = val;
                arr[i+n/2] = -val;
                val++;
            }
        }
        else
        {   int val = 1;
            arr[n/2] = 0;
            for(int i=0 ; i<n/2 ; i++)
            {   
                arr[i] = val;
                arr[i+n/2] = -val;
                val++;
            }
        }
        return arr;
    }

}