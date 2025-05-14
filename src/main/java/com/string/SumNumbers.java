package com.string;

public class SumNumbers
{
    public static int sumOfDigit(String str){
        int sum = 0;
        String num = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                num += ch;
            } else {
                if (!num.isEmpty()) {
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
        }

        // Add last number if string ends with digits
        if (!num.isEmpty()) {
            sum += Integer.parseInt(num);
        }

        return sum;
    }

    public static void main(String[] args) {
        String str = "aa11b33";
        int i = sumOfDigit(str);
        System.out.print(i);

        /*
        sumNumbers("abc123xyz") → 123
        sumNumbers("aa11b33") → 44
        sumNumbers("7 11") → 18
         */

    }
}
