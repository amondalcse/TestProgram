package leetcode;

public class LeetCode {
     public static boolean isPalindrome(int x)

    {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reverse = 0, original =x;
        while (x > 0) {
            int rev = x % 10;
            reverse = reverse * 10+ rev;
            x = x / 10;
        }
        return original == reverse;

    }

    public static void main(String[] args) {
        int[] testCases = {121, -121, 10, 0, 12321};

        for (int num : testCases) {
            System.out.println("Input: " + num + " → Output: " + isPalindrome(num));
        }
    }
}




