package com.string2;

public class PrefixAgain
{
    public static boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);

        for (int i = n; i <= str.length() - n; i++) {
            if (str.substring(i, i + n).equals(prefix)) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {

        System.out.println(prefixAgain("abXYabc", 1));  // true
        System.out.println(prefixAgain("abXYabc", 2));  // true
        System.out.println(prefixAgain("abXYabc", 3));
    }
}
