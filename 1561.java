class Solution {
public int maxCoins(int[] piles) {
        Arrays.sort(piles); 
        int n = piles.length; 
        int max = 0; //Track my coin value
        
        //Iterate from n/3 to n-2 inclusive (bob takes the first third in order to get the lowest amount)
        for(int i = n/3; i < n-1; i+=2) {
            max += piles[i]; //Add this value to max
        }
        
        return max; //Return the max value
    }
}