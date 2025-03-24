package com.practice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNumberInArray
{
    public static void main(String[] args) {
        int[] number={1,2,2,3,3,3,3,4,4,4};
        //Using set
        /*Set set = new HashSet();
        for(int i=0;i<number.length;i++){
            set.add(number[i]);
        }
        System.out.println(set);*/

        //Using normal loops
        int newLength=1;
        for(int i=0;i<number.length;i++){
            int j;
            for(j=0;j<newLength;j++){
                if(number[i]==number[j]){
                    break;
                }
            }
            if(j==newLength){
                number[newLength]=number[i];
                newLength++;
            }
        }
        for(int i=0;i<newLength;i++){
            System.out.print(number[i]+" ");
        }
    }
}
