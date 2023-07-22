import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Solution s1 = new Solution();

        if(s1.isValid(s))
        {
            System.out.println("Parentheses are valid");
        }
        else
            System.out.println("Parentheses are not valid");
    };
}