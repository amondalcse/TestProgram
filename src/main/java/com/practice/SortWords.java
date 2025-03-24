package com.practice;

public class SortWords
{
    public static void main(String[] args) {
        String str ="is2 sentence4 This1 a3";
        //Output: This is a sentence
        String[] words =str.split(" ");
        String[] sortedWords = new String[words.length];
        //System.out.println(sortedWords);
        for(String word:words){
            int position = Character.getNumericValue(word.charAt(word.length()-1));
            sortedWords[position-1] = word.substring(0,word.length()-1);
        }
        System.out.println(String.join(" ",sortedWords));



    }
}
