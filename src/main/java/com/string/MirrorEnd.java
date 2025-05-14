package com.string;

public class MirrorEnd
{
    public static String mirror(String str){
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)==str.charAt(str.length()-1 - i)){
            sb.append(str.charAt(i));
        }
        else{
            break;
        }
    }

        return sb.toString();
    }
    public static void main(String[] args) {
        String str ="aba";
        String s =mirror(str);
        System.out.print(s);
        /*
        mirrorEnds("abXYZba") → "ab"
        mirrorEnds("abca") → "a"
        mirrorEnds("aba") → "aba"
         */

    }
}
