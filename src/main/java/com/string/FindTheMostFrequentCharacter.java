package com.string;

import java.util.HashMap;
import java.util.Map;

public class FindTheMostFrequentCharacter
{
    public static void main(String[] args) {
        String str = "abhijitjj";
        Map<Character,Integer> map = new HashMap<>();
        for(char ch:str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        int maxCount=0;
        char maxChar=str.charAt(0);
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>=maxCount){
                maxCount=entry.getValue();
                maxChar=entry.getKey();
            }
        }
        System.out.print(maxChar+":");
        System.out.print(maxCount);
    }
}
