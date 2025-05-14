package com.string;

public class GHappy
{
    public static boolean gHappy(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                boolean hasLeftG = (i > 0 && str.charAt(i - 1) == 'g');
                boolean hasRightG = (i < str.length() - 1 && str.charAt(i + 1) == 'g');
                if (!hasLeftG && !hasRightG) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "xxggxx";
        Boolean b =gHappy(str);
        System.out.print(b);


                /*
                gHappy("xxggxx") → true
                gHappy("xxgxx") → false
                gHappy("xxggyygxx") → false
                 */
    }
}
