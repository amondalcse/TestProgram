package com.string;

public class ReverseWordInASentence
{
    public static void main(String[] args) {
        String str = "I love India and India is very beautful country";
        String[] words =str.split(" ");
        String reverseWord =" ";
        for(int i=words.length-1;i>=0;i--){
            reverseWord+=words[i]+ " ";
        }
        System.out.print(reverseWord+ " ");
    }
}
