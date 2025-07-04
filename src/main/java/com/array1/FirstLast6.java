package com.array1;

public class FirstLast6
{
    public static boolean firstLast6(int[] nums) {
        if (nums.length == 0) {
            return false; // Empty array case
        }
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(firstLast6(new int[]{1, 2, 6}));        // true
        System.out.println(firstLast6(new int[]{6, 1, 2, 3}));     // true
        System.out.println(firstLast6(new int[]{13, 6, 1, 2, 3})); // false
        System.out.println(firstLast6(new int[]{}));               // false (empty array)
    }
}
