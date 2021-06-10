class Solution {
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        calculateSum(root,low,high);
        return sum;
    }
    
    private void calculateSum(TreeNode rootNode , int low , int high){
        if(rootNode==null)
            return;
        if(rootNode.val>=low&&rootNode.val<=high)
            sum+=rootNode.val;
        
        if(rootNode.val>low)
            calculateSum(rootNode.left,low,high);
        if(rootNode.val<high)
            calculateSum(rootNode.right,low,high);
    }
    
}