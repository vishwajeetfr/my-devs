import java.util.HashSet;
import java.util.Scanner;


//The given program takes an array and returns "True" if there exists a duplicate and "False" if not
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int[] a = new int[i];
        for(int k = 0 ; k<i ; k++)
        {
            a[k] = in.nextInt();
        }
        Solution a1 = new Solution();
        System.out.println(a1.containsDuplicate(a));
    }
}