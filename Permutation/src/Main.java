
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Permutations permutations = new Permutations();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = permutations.permute(nums);

        for (List<Integer> permutation : result) {
            System.out.println(permutation);
        }
    }
}