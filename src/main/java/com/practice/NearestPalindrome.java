package com.practice;

import java.util.Scanner;

public class NearestPalindrome {
    public static void main(String[] args) {
        System.out.println(nearestPalindrome(110)); // Output: 111
        System.out.println(nearestPalindrome(50)); // Output: 121
    }

    public static boolean isPalindrome(int n) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        n = sc.nextInt();*/
        int original = n;
        int reverse = 0;
        int rem = 0;
        while (n > 0) {
            rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
            //System.out.println(reverse);
        }
        return original == reverse;
    }

    public static int nearestPalindrome(int n) {
        for (int i = 0; i <= n; i++) {
            if (isPalindrome(n - i)) {
                return n - i;
            }
            if (isPalindrome(n + i)) {
                return n + i;
            }
        }
        return n;
    }
}



