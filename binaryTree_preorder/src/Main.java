public class Main {
    public static void main(String[] args)
    {
        BinaryTree bt1 = new BinaryTree();
        BinaryTreeNode N1 = new BinaryTreeNode();
        BinaryTreeNode N2 = new BinaryTreeNode();
        BinaryTreeNode N3 = new BinaryTreeNode();
        BinaryTreeNode N4 = new BinaryTreeNode();
        BinaryTreeNode N5 = new BinaryTreeNode();
        BinaryTreeNode N6 = new BinaryTreeNode();
        BinaryTreeNode N7 = new BinaryTreeNode();
        BinaryTreeNode N8 = new BinaryTreeNode();
        BinaryTreeNode N9 = new BinaryTreeNode();

        bt1.root = N1;
        N1.val = "N1";
        N2.val = "N2";
        N3.val = "N3";
        N4.val = "N4";
        N5.val = "N5";
        N6.val = "N6";
        N7.val = "N7";
        N8.val = "N8";
        N9.val = "N9";

        N1.left = N2;
        N1.right = N3;
        N2.left = N4;
        N2.right = N5;
        N3.left = N6;
        N3.right = N7;
        N4.left = N8;
        N4.right = N9;

        bt1.preorder(bt1.root);
    }
}