class Solution {
        
    List<Integer> li = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root!=null)
        {
            li.add(root.val);

            for(int i=0 ; i<root.children.size() ; i++)
            {   
                if(root.children.get(i)!=null)
                preorder(root.children.get(i));
             }
        }

        return li;
    }
}