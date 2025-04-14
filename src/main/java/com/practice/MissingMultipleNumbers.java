package com.practice;

import java.util.HashSet;
import java.util.Set;

public class MissingMultipleNumbers
{
    public static void main(String[] args) {
        int[] num= {1,3,5,7,9};
        int min = num[0];
        int max= num[num.length-1];
        Set<Integer> set = new HashSet();
        for(int n:num){
            set.add(n);
        }
       // System.out.print("the added value in set"+set);
        for(int i=min;i<=max;i++){
            if(set.add(i)) {
                System.out.print(i);
            }
        }
       // System.out.print(set);
    }
}
