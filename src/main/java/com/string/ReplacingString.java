package com.string;

public class ReplacingString
{
    public static String notReplace(String str){
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            // Check if "is" starts at current index
            if (i + 1 < str.length() &&
                    str.charAt(i) == 'i' &&
                    str.charAt(i + 1) == 's' &&
                    (i == 0 || !Character.isLetter(str.charAt(i - 1))) &&
                    (i + 2 == str.length() || !Character.isLetter(str.charAt(i + 2)))) {

                result.append("is not");
                i += 2; // Skip the "is"
            } else {
                result.append(str.charAt(i));
                i++;
            }
        }

        return result.toString();
    }
    public static void main(String args[]){

        String str = "is-is";
        String s = notReplace(str);
        System.out.print(s);
        /*
        notReplace("is test") → "is not test"
        notReplace("is-is") → "is not-is not"
        notReplace("This is right") → "This is not right"
         */
    }
}
