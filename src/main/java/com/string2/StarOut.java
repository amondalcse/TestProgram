package com.string2;

public class StarOut
{
    public static void main(String[] args) {
        System.out.println(starOut("ab*cd"));       // ad
        System.out.println(starOut("ab**cd"));      // ad
        System.out.println(starOut("sm*eilly"));    // silly
    }

    public static String starOut(String str) {
        StringBuilder result = new StringBuilder();
        int len = str.length();

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == '*'
                    || (i > 0 && str.charAt(i - 1) == '*')
                    || (i < len - 1 && str.charAt(i + 1) == '*')) {
                continue;
            }
            result.append(str.charAt(i));
        }

        return result.toString();
    }
}
