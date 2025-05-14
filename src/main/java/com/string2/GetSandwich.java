package com.string2;

public class GetSandwich
{
    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread"));      // "jam"
        System.out.println(getSandwich("xxbreadjambreadyy"));  // "jam"
        System.out.println(getSandwich("xxbreadyy"));          // ""
    }

    public static String getSandwich(String str) {
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");

        if (first == -1 || last == -1 || first == last) {
            return "";
        }

        return str.substring(first + 5, last);
    }
}
