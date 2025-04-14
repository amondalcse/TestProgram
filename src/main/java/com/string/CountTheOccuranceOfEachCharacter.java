package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountTheOccuranceOfEachCharacter
{
    public static void main(String[] args) {
        String str ="abhijitt";
        Map<Character,Integer> map = new HashMap<>();

        for(char ch:str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }

        }
        Set<Character> set =map.keySet();
        for(char c:set){
            if(map.get(c)>=1){
                System.out.print(c +":"+map.get(c) +" ");
            }
        }
    }
}
