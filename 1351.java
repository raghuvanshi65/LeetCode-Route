class Solution {
    public int countNegatives(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if(grid[j][i]<0){
                    sum += grid.length-j;
                    break;
                }
            }
        }
        return sum;
    }
}