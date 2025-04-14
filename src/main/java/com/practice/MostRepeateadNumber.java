package com.practice;

import java.util.HashMap;
import java.util.Map;

public class MostRepeateadNumber
{
    public static void main(String[] args) {
        int count=0;
        int secondMaxRepeat=0;
        int[] numbers={2,3,5,6,2,8,3,7,3,8};
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: numbers){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        int max_int=0;
        for(Map.Entry<Integer,Integer> ent: map.entrySet()){
            if(ent.getValue()>max_int){
                max_int = ent.getKey();
                //count = ent.getValue();
            }
        }
        for(Map.Entry<Integer,Integer> ent: map.entrySet()){
            if(ent.getValue()>secondMaxRepeat && ent.getValue()!=max_int){
                secondMaxRepeat = ent.getKey();
                //count = ent.getValue();
            }
        }

        //System.out.println(max_int+" :"+count);
        System.out.println("max_int"+" :"+max_int);
        System.out.println("secondMaxRepeat"+" :"+secondMaxRepeat);
       /* int mostFrequentNumber=numbers[0];
        int secondMostFrequentNumber=numbers[0];
        int max_count=0;
        int secondMax_count=0;
        for(int i=0;i< numbers.length;i++){
            int count1=0;
            for(int j=0;j<numbers.length;j++){
                if(numbers[i]==numbers[j]){
                    count1++;
                }
            }
            if(count1>max_count){
                secondMax_count=max_count;
                secondMostFrequentNumber=mostFrequentNumber;

                max_count=count1;
                mostFrequentNumber=numbers[i];
            }else if(count1>secondMax_count && numbers[i]!=mostFrequentNumber){
                secondMax_count=count1;
                secondMostFrequentNumber=numbers[i];
            }
        }
        System.out.println("Most repeated number: " + mostFrequentNumber);
        System.out.println("Second most repeated number: " + secondMostFrequentNumber);*/

    }
}
