public class BinaryTree {
    BinaryTreeNode root = new BinaryTreeNode();

    BinaryTree()
    {
        this.root = null;
    }
    void preorder(BinaryTreeNode node)
    {
        if(node==null)
        {
            return;
        }
        System.out.println(node.val+" ");
        preorder(node.left);
        preorder(node.right);
    }
}
