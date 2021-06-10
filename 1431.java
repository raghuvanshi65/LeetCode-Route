class Solution {
   public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> li = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        for(int i : candies)
        {
            if(i+extraCandies>=max)
            li.add(true);
            else
            li.add(false);
        }
        return li;
    }
}