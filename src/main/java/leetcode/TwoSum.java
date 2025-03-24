package leetcode;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] a = {6, 12, 18, 6, 1, 16};
        int target = 17;

        int[] result = findTwoSum(a, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two elements found with sum " + target);
        }
    }

    public static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // Stores number & its index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Find the required pair

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // Return indices

            }

            map.put(nums[i], i); // Store element index
        }
        return new int[]{}; // No solution found
    }
}


