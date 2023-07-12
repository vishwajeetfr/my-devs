import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i<n ; i++)
        {
            a[i] = in.nextInt();
        }
        Solution obj1 = new Solution();
        System.out.println(obj1.findDuplicate(a));
    }
}