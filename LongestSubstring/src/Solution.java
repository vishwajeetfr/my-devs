import java.util.HashSet;

public class Solution
{
    public int lengestSubstring(String s) {
        char[] c = s.toCharArray();
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            HashSet<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (set.contains(c[j])) {
                    if (count > max) {
                        max = count;
                    }
                    break;
                } else {
                    count++;
                    set.add(c[j]);
                }
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}
