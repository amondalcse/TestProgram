package com.string2;

public class MixString
{
    public static String mixString(String a, String b){
        StringBuilder result = new StringBuilder();
        int maxLen = Math.max(a.length(), b.length());

        for (int i = 0; i < maxLen; i++) {
            if (i < a.length()) result.append(a.charAt(i));
            if (i < b.length()) result.append(b.charAt(i));
        }

        return result.toString();
    }
    public static void main(String[] args) {

        System.out.print(mixString("Hi", "There"));
        /*
        mixString("abc", "xyz") → "axbycz"
        mixString("Hi", "There") → "HTihere"
        mixString("xxxx", "There") → "xTxhxexre"
         */

    }
}
