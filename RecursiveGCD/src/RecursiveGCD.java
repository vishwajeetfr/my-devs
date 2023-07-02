import java.sql.SQLOutput;
import java.util.Scanner;

public class RecursiveGCD
{

    static void gcd(long a,long b)
    {
        if(a==0 || b==0)
        {
            System.out.println("GCD is not defined");
        }
        else
        {
            if (a < b) {
                long temp = a;
                a = b;
                b = temp;
            }
            if (a % b == 0)
            {
                System.out.println("The GCD is " + b);
            } else
            {
                gcd(b, a % b);
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two integers");
        long a = in.nextLong();
        long b = in.nextLong();
        gcd(a,b);
    }
}