import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution solution = new Solution();
        String input = in.nextLine();
        int result = solution.lengestSubstring(input);
        System.out.println(result);
    }
}