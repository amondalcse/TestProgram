package com.string;

public class ReverseEachWordChar
{
    public static void main(String[] args) {
        String str ="I love India";
        String reverseString=" ";
        String[] words =str.split(" ");
        for(int i=0;i<=words.length-1;i++){
            String word =words[i];
            String reverse =" ";
            char ch;
            for(int j=0;j<word.length();j++){
                ch=word.charAt(j);
                reverse=ch+reverse;
            }
            reverseString = reverseString +reverse + " ";

        }
        System.out.print(reverseString);
    }
}
