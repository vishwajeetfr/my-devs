public class BinaryLL
{
    BinaryNode root;
    BinaryNode BuildBST(int val,BinaryNode root)
    {
        if(root==null)
        {
            BinaryNode newNode = new BinaryNode(val);
            return newNode;
        }
        BinaryNode temp;
        if(val < root.data)
        {
            temp = BuildBST(val,root.left);
            root.left = temp;
        }
        else
        {
            temp = BuildBST(val,root.right);
            root.right = temp;
        }
        return root;
    }

    void preorderTraversal(BinaryNode node)
    {
        if(node==null)
        {
            return;
        }
        System.out.println(node.data + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }


}
