package com.practice;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatativeWord
{
    public static void main(String[] args) {
        String str ="Welcome  is Java World. is Java is Secure. Java is Robust";
        String[] words =str.split(" ");
        Map<String,Integer> map = new HashMap<>();
        int max_count=0;

        for(String word:words){

            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);

            }else{
                map.put(word,1);
            }
        }
        String maxString=words.toString();
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue()>max_count){
                max_count= entry.getValue();
                maxString =entry.getKey();
            }
        }
        System.out.println(max_count);
        System.out.println(maxString);
    }
}
