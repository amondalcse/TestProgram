package com.string2;


public class DoubleChar
{
    public static String doubleCount(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            sb.append(ch).append(ch);
        }
            return sb.toString();
        }

    public static void main(String[] args) {
        String str = "The";
        String s =doubleCount(str);
        System.out.print(s);

        /*
        doubleChar("The") → "TThhee"
        doubleChar("AAbb") → "AAAAbbbb"
        doubleChar("Hi-There") → "HHii--TThheerree"
         */
    }
}
