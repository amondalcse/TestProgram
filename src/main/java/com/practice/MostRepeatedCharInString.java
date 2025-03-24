package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MostRepeatedCharInString
{
    public static void main(String[] args) {
        String str = "programmingg";
        int maxCount=0;
        Map<Character,Integer> map = new HashMap<>();
        for(char ch: str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
                }else{
                map.put(ch,1);
            }

        }
        char maxChar =str.charAt(0);
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue()>maxCount){
                maxCount= entry.getValue();
                maxChar =entry.getKey();
            }
        }
        System.out.println(maxChar);


        /*Set<Character> set =map.keySet();
        for(Character c:set){
            if(map.get(c)>=1){
                System.out.println(c+ " : "+map.get(c));

            }

        }*/
    }
}
