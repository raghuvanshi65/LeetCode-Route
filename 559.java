class Solution {
    
    private int max_depth=0;
        
    public int maxDepth(Node root) {
        if(root==null) 
            return 0;
        getDepth(root,1);
        return max_depth;
    }
    
    private void getDepth(Node root , int depth){
        if(root==null)
            return;
         
        max_depth = Math.max(max_depth , depth);
        for(Node child : root.children)
            getDepth(child , depth+1);
    }
}