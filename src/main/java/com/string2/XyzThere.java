package com.string2;

public class XyzThere
{
    public static boolean xyzThere(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                if (i == 0 || str.charAt(i - 1) != '.') {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "abc.xyz";
        boolean b = xyzThere(str);
        System.out.print(b);

        /*
        xyzThere("abcxyz") → true
        xyzThere("abc.xyz") → false
        xyzThere("xyz.abc") → true
         */
    }
}
