class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int[] temp = new int[len];
        for(int i=len-1 ; i>=0 ; i--)
        {
            if(i==arr.length-1)
            temp[i] = -1;
            else
            temp[i] = Math.max(arr[i+1], temp[i+1]);
        }

        return temp;
    }
}