class Solution {
    public int numTimesAllBlue(int[] light) {
        int rightMax = -1 , count = 0;
        for(int i=0 ; i<light.length ; i++){
            if(light[i]>rightMax)
                rightMax = light[i];

            if(i+1==rightMax)
                count++;
        }

        return count;
    }
}