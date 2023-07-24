public class Main {
    public static void main(String[] args) {

        int a1[] = {4,1,2};
        int a2[] = {1,3,4,2};
        Solution s1 = new Solution();
        for( int a : s1.nextGreaterElement(a1,a2))
        {
            System.out.println(a);
        }
    }
}