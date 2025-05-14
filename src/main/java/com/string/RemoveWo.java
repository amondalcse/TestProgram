package com.string;

public class RemoveWo
{
    public static String withoutString(String base, String remove) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int len = remove.length();

        while (i <= base.length() - len) {
            String sub = base.substring(i, i + len);
            if (sub.equalsIgnoreCase(remove)) {
                i += len; // Skip over the matched substring
            } else {
                result.append(base.charAt(i));
                i++;
            }
        }

        // Append any remaining characters
        result.append(base.substring(i));

        return result.toString();
    }

    public static void main(String[] args) {
        String str ="Hello there";
        String s =withoutString(str,"llo");
        System.out.print(s);


        /*
        withoutString("Hello there", "llo") → "He there"
        withoutString("Hello there", "e") → "Hllo thr"
        withoutString("Hello there", "x") → "Hello there"
         */
    }

}

