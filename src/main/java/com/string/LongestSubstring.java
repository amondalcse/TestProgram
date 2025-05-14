package com.string;

public class LongestSubstring {

    public static String sameEnds(String str){
    int maxLen = str.length() / 2;
    String result = "";

    for(int i = 0; i <=maxLen;i++) {
        String start = str.substring(0, i);
        String end = str.substring(str.length() - i);
        if (start.equals(end)) {
            result = start;
        }
    }

        return result;
    }

    public static void main(String[] args) {
        String str = "xx";
        String s =sameEnds(str);
        System.out.print(s);

                /*
                sameEnds("abXYab") → "ab"
                sameEnds("xx") → "x"
                sameEnds("xxx") → "x"
                 */
    }
}
