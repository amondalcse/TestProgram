package com.string;

public class SumOfDigit
{
    public static int sum(String str){
        int total=0;
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(Character.isDigit(ch)){
                //total =ch - '0';
                total +=Character.getNumericValue(ch);
            }
        }

        return total;
    }
    public static void main(String[] args) {
        /*
        sumDigits("aa1bc2d3") → 6
        sumDigits("aa11b33") → 8
        sumDigits("Chocolate") → 0
         */
        String str ="aa1bc2d3";
        int t = sum(str);
        System.out.print(t);
    }
}
