package com.string2;

public class OneTwo
{
    public static void main(String[] args) {
        System.out.println(oneTwo("abc"));        // bca
        System.out.println(oneTwo("tca"));        // cat
        System.out.println(oneTwo("tcagdo"));     // catdog
    }

    public static String oneTwo(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i + 2 < str.length(); i += 3) {
            String group = str.substring(i, i + 3);
            // move first char to the end
            result.append(group.substring(1)).append(group.charAt(0));
        }

        return result.toString();
    }
}
