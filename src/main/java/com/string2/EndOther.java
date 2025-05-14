package com.string2;

public class EndOther
{
    public static boolean endOther(String str, String str1) {
        String aLower = str.toLowerCase();
        String bLower = str1.toLowerCase();
        return (aLower.endsWith(bLower) || bLower.endsWith(aLower));

    }
    public static void main(String[] args) {
        System.out.print(endOther("Hiabc1", "abc"));

                /*
                endOther("Hiabc", "abc") → true
                endOther("AbC", "HiaBc") → true
                endOther("abc", "abXabc") → true
                 */
    }
}
