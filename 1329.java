class Solution {
    public int[][] diagonalSort(int[][] mat) {
        Map<Integer , List<Integer>> mp = new HashMap<>();
        int row = mat[0].length , cols = mat.length; ;
        for(int i=0 ; i<cols ; i++){
            for(int j=0 ; j<row ; j++) {
                List<Integer> li = mp.get(i - j);
                if(li==null)
                    li=new ArrayList<>();
                else
                    li = new ArrayList<>(li);
                li.add(mat[i][j]);
                mp.put(i - j, li);
            }
        }

        for(List<Integer> tempList : mp.values())
            Collections.sort(tempList);

        for(int i=0 ; i<cols ; i++){
            for(int j=0 ; j<row ; j++) {
               Integer number = mp.get(i-j).remove(0);
               mat[i][j] = number;
            }
        }

        return mat;
    }
}