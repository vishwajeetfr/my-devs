class Solution {

    TreeNode node;

    public void binarySearch(TreeNode root,int val)
    {
        if(root==null)
        {
            return;
        }
        if(val==root.val)
        {
            node = root;
            return;
        }
        if(node==null)
        {
            binarySearch(root.left,val);
            binarySearch(root.right,val);
        }
    }

    public TreeNode BuildBST(TreeNode node,int n)
    {
        if(node==null)
        {
            TreeNode newNode = new TreeNode();
            newNode.val = n;
            return newNode;
        }
        if(n<node.val)
        {
            node.left = BuildBST(node.left,n);
            return node;
        }
        else
        {
            node.right = BuildBST(node.right,n);
            return node;
        }
    }
    public TreeNode searchBST(TreeNode root, int val)
    {
        binarySearch(root,val);
        return node;

    }
}