class Solution {
    public TreeNode increasingBST(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        
        System.out.println(que.peek().val);
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while(!que.isEmpty()){
            TreeNode tn = que.poll();
            pq.add(tn.val);
            
            if(tn.left!=null)
                que.offer(tn.left);
            if(tn.right!=null)
                que.offer(tn.right);
        }
        
        TreeNode b = new TreeNode(pq.poll());
        b.left = null;
        root = b;
        int size = pq.size();
        for(int i=0 ; i<size ; i++)
        {   
            Integer temp = pq.poll();
            
            b.left = null;
            b.right = new TreeNode(temp);
            b = b.right;
        }
        
        return root;
    }
}