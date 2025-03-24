package com.practice;

import java.util.StringTokenizer;

public class CodeNoOFTimes
{
    public static void main(String[] args) {
        String str ="codeaacodeaacode";
        /*int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='c' || str.charAt(i)=='o' || str.charAt(i)=='d' || str.charAt(i)=='e' || str.charAt(i)=='a'){
                char ch =str.charAt(i);
                //System.out.println(ch);

                count++;
            }
        }

        System.out.println(count/5)*/;
        int count=0;
        StringTokenizer tokenizer = new StringTokenizer(str,"a");
        while(tokenizer.hasMoreTokens()){
            String token =tokenizer.nextToken();
            if(token.equals("code")){
                count++;
            }
        }
        System.out.println("occerence of code:"+count);
    }
}
