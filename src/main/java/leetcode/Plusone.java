package leetcode;

import java.util.Arrays;

public class Plusone
{
        public static int[] plusOne(int[] digits) {
            int n = digits.length;

            // Traverse from the last digit
            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;  // Simple case: Increment and return
                    return digits;
                }
                digits[i] = 0;  // If digit is 9, make it 0 and continue
            }

            // If all digits were 9, create a new array with an extra digit
            int[] newNumber = new int[n + 1];
            newNumber[0] = 1;  // The first digit becomes 1, rest default to 0
            return newNumber;
        }

        public static void main(String[] args) {
            int[][] testCases = {
                    {1, 2, 3},
                    {4, 3, 2, 1},
                    {9},
                    {9, 9, 9}
            };

            for (int[] test : testCases) {
                System.out.println("Input: " + Arrays.toString(test) + " → Output: " + Arrays.toString(plusOne(test)));
            }
        }
}


