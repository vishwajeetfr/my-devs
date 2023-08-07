public class Main {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        int[] arr = { 5, 1, 4, 3, 6, 7};
        TreeNode root = null;
        for(int i : arr)
        {
            root = s1.BuildBST(root,i);
        }
        s1.searchBST(root,4);
        
    }
}