package com.practice;


import java.util.Locale;

public class CovertUpperCasefirstTwoChar
{
    public static void main(String[] args) {
        String str ="this is test";
        String[] words = str.split(" ");
        StringBuilder sb= new StringBuilder();
        for(String word: words){
            if(word.length()>2){
                sb.append(word.substring(0,2).toUpperCase()).append(word.substring(2)).append(" ");
            }else{
                sb.append(word.toLowerCase()).append(" ");
            }


        }
        System.out.print(sb.toString().trim());



    }
}
