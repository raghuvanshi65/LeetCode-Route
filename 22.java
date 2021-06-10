class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> combinations = new ArrayList<>();
        getAllCombinations(new char[2 * n], 0, combinations);
        return combinations;
    }


    public void getAllCombinations(char[] arr , int pos , List<String> com){
        if(pos==arr.length){
            if(isValid(arr))
                com.add(new String(arr));
        }
        else{
            arr[pos] = '(';
            getAllCombinations(arr , pos+1 , com);
            arr[pos] = ')';
            getAllCombinations(arr , pos+1 , com);
        }
    }

    public boolean isValid(char[] arr){
        int sum = 0;
        for(int ch : arr){
            if(ch=='(')
                sum--;
            else
                sum++;
            if(sum>0)
                return false;
        }
        return sum==0;
    }
}