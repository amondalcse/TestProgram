package com.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OccuranceOfEachNumber
{
    public static void main(String[] args) {
        int[] numbers={1,2,2,2,3,3,4,4};
        Map<Integer,Integer> map = new HashMap<>();
        for(int number:numbers){
            if(map.containsKey(number)){
                map.put(number,map.get(number)+1);
            }else{
                map.put(number,1);
            }
        }
        Set<Integer> set = map.keySet();
        for(int s:set){
            if(map.get(s)>=1){
                System.out.println(s +" : "+map.get(s));
            }
        }
    }
}
