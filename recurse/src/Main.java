public class Main {
    int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return n + sum(n-1);

        }
    }
    public static void main(String[] args)
    {
        Main s = new Main();
        System.out.println(s.sum(6));
    }
}