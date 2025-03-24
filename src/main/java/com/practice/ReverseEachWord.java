package com.practice;

public class ReverseEachWord
{
    public static void main(String[] args) {
        String str = " Hello world";
        //Output is: worlds hello
        /*String str1=" ";
        String[] words=str.split(" ");
        for(int i=words.length-1;i>=0;i--) {
            System.out.print(words[i]+" ");
        }*/

        //Output is olleH dlrow
        String reverseString=" ";
        String[] words = str.split(" ");
        for(int i=0;i<words.length;i++){
            String word = words[i];
            String str1= " ";
            char ch;
            for(int j=0;j<word.length();j++){
                ch = word.charAt(j);
                str1 = ch+str1;

            }
            reverseString = reverseString+str1 +" ";
        }
        System.out.println(reverseString);
    }
}
