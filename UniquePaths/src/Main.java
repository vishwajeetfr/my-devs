import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        Solution s1 = new Solution();
        System.out.println("m = "+ m + " : n = "+n);
        System.out.println("Maximum no. of unique paths from arr[0][0] to arr[m-1][n-1] are " + s1.uniquePaths(m,n));
    }
}