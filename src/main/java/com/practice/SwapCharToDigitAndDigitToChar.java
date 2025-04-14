package com.practice;

public class SwapCharToDigitAndDigitToChar
{
    public static void main(String[] args) {
        String str = "a1b2c3d4";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i=i+2){
             char ch = str.charAt(i);
             char dig = str.charAt(i+1);

            char temp = ch;
            ch=dig;
            dig=temp;
            sb.append(ch).append(dig);
        }
        System.out.print(sb);

    }


}
