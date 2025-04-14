package com.string;

import java.util.Arrays;

public class CheckTwoStringAreAnangram
{
    public static void main(String[] args) {
        String s1="Abjhiti";
        String s2 = "thiijab";

        char[] ch =s1.toLowerCase().toCharArray();
        char[] ch1=s2.toLowerCase().toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        if(Arrays.equals(ch,ch1)){
            System.out.print("Anagram");
        }else{
            System.out.print("Not Anagram");
        }
    }
}
