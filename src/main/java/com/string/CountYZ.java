package com.string;

public class CountYZ
{
    public static int count(String str){
        int count = 0;
        str = str.toLowerCase(); // Case-insensitive

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((ch == 'y' || ch == 'z') && (i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1)))) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str ="dayh fh";
        int c =count(str);
        System.out.print(c);

        /*
        countYZ("fez day") → 2
        countYZ("day fez") → 2
        countYZ("day fyyyz") → 2
         */
    }
}
