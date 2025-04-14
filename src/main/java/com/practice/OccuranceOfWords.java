package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OccuranceOfWords
{
    public static void main(String[] args) {
        String str ="I love love java";
        String[] words =str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        int k=0;
        String v=words[0];
        for(String word:words){
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }else{
                map.put(word,1);
            }
        }
        Set<String> set = map.keySet();
        for(String s:set){
            if(map.get(s)>1){
                System.out.print(s + " "+map.get(s)+" ");
            }
        }

       /* for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()>=k){
                v=entry.getKey();
                k=entry.getValue();
            }
        }*/
        /*System.out.print(k + " ");
        System.out.print(v+ " ");
        System.out.print(map+ " ");*/
    }
}
