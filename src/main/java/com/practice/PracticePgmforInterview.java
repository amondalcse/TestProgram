package com.practice;

import javax.print.attribute.HashAttributeSet;
import java.util.*;

public class PracticePgmforInterview
{

    public static void main(String[] args) {
        String str = "automation test suites contains all test case from functional test case";
        String[] words = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(String word: words){
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }else{
                map.put(word,1);
            }
        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey() +": "+entry.getValue()+ " ");
        }


    }


}
