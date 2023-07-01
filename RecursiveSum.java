import java.util.Scanner;

public class RecursiveSum
{
    static int sum(int n,int sum)
    {
        int a = n%10;
        sum = sum + a;
        n = n/10;
        if(n!=0)
        {
            return sum(n,sum);
        }
        else {
            return sum;
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = 0;
        int sum = sum(n,s);
        System.out.println(sum);
    }
}