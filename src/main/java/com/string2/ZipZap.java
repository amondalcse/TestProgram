package com.string2;

public class ZipZap
{
    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap"));     // zpXzp
        System.out.println(zipZap("zopzop"));      // zpzp
        System.out.println(zipZap("zzzopzop"));    // zzzpzp
    }

    public static String zipZap(String str) {
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < str.length()) {
            if (i + 2 < str.length() && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                result.append("zp");
                i += 3;  // Skip the middle character
            } else {
                result.append(str.charAt(i));
                i++;
            }
        }

        return result.toString();
    }
}
