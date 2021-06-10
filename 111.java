class Solution {

    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        return getDepthByBFS(root) + 1;
    }

    public int getDepthByBFS(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);

        int level = 0;
        while (!que.isEmpty()) {
            int size = que.size();
            for (int i = 0 ; i < size ; i++) {
                TreeNode temp = que.poll();
                if (temp.left == null && temp.right == null)
                    return level;
                if (temp.left != null)
                    que.offer(temp.left);
                if (temp.right != null)
                    que.offer(temp.right);
            }

            level++;
        }

        return level;
    }
}