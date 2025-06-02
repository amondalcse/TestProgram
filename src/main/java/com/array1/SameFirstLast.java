package com.array1;

public class SameFirstLast
{
    public static boolean sameFirstLast(int[] nums) {
        if (nums.length >= 1) {
            return nums[0] == nums[nums.length - 1];
        }
        return false;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(sameFirstLast(new int[]{1, 2, 3}));       // false
        System.out.println(sameFirstLast(new int[]{1, 2, 3, 1}));    // true
        System.out.println(sameFirstLast(new int[]{1, 2, 1}));       // true
        System.out.println(sameFirstLast(new int[]{}));              // false (empty array)
    }
}
