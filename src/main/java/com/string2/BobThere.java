package com.string2;

public class BobThere
{
    public static boolean bobthere(String str){

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='b' && str.charAt(i+2)=='b'){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "bac";
        System.out.print(bobthere(str));
        /*
        bobThere("abcbob") → true
        bobThere("b9b") → true
        bobThere("bac") → false
         */

    }
}
