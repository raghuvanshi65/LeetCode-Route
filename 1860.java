class Solution {
    public int[] memLeak(int memory1, int memory2) {
        int[] arr = new int[3];
        int i = 1;
        while(memory1>0||memory2>0){
            if(memory1>=memory2){
                if(memory1<i)
                    break;
                memory1 -= i;
            }else{
                if(memory2<i)
                    break;
                memory2 -= i;
            }

            if(memory1<=0&&memory2<=0)
                break;
            i++;
        }        
        arr[0] = i;
        arr[1] = memory1<=0 ? 0 : memory1;
        arr[2] = memory2<= 0 ? 0 : memory2;
    
        return arr;
    }
}