package com.string2;

public class RpeatSeperator
{
    public static String repeatSeperator(String a,String b, int n){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(a);
            if (i < n - 1) {
                sb.append(b);
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {

        System.out.print(repeatSeperator("Word", "X", 3));
        /*
        repeatSeparator("Word", "X", 3) → "WordXWordXWord"
        repeatSeparator("This", "And", 2) → "ThisAndThis"
        repeatSeparator("This", "And", 1) → "This"
         */

    }
}
