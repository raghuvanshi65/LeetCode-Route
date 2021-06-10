class Solution {
    public int[] minOperations(String boxes) {
        int length = boxes.length() , counter = 0;
        char[] arr = boxes.toCharArray();
        Set<Integer> set1 = new HashSet<>();

        for(int i=0 ; i<length ; i++)
            if(arr[i]=='1'){
                set1.add(i);
                counter++;
            }

        int arr1[] = new int[length];
        for(int i=0 ; i<length ; i++)
        {
            Iterator<Integer> setItr = set1.iterator();
            while(setItr.hasNext()){
                int x = setItr.next();
                if(x!=i)
                    arr1[i] += Math.abs(x-i);
            }
        }

        return arr1;
    }
}