package com.string2;

public class Countcode
{
    public static int countCode(String str) {
        int count=0;
        for(int i=0;i<str.length()-3;i++){
            //String s = str.substring(i,i+4);
            if(str.charAt(i)=='c' && str.charAt(i+1)=='o' && str.charAt(i+3)=='e'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "codexxcode";
        int c = countCode(str);
        System.out.print(c);
        /*
        countCode("aaacodebbb") → 1
        countCode("codexxcode") → 2
        countCode("cozexxcope") → 2
         */
    }
}
