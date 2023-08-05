public class Main {
    public static void main(String[] args)
    {

        BinaryLL bst= new BinaryLL();
        int[] arr = {8,5,1,7,10,12};
        for(int i : arr)
        {
           bst.root = bst.BuildBST(i, bst.root);
        }

        bst.preorderTraversal(bst.root);
    }
}