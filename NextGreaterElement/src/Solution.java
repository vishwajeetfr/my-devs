import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] sol = new int[nums2.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            if (stack.empty()) {
                sol[i] = -1;
            } else {
                while (!stack.empty() && stack.peek() <= nums2[i]) {
                    stack.pop();
                }
                sol[i] = stack.empty() ? -1 : stack.peek();
            }
            stack.push(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = sol[findIndex(nums2, nums1[i])];
        }

        return nums1;
    }

    private int findIndex(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}