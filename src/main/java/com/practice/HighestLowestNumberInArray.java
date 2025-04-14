package com.practice;

public class HighestLowestNumberInArray
{
    public static void main(String[] args){
        int[] array = {15,34,22,44,61,56,11};
        int highest=array[0];
        int lowest=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>highest)
            {
                highest=array[i];
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]<lowest){
                lowest=array[i];
            }
        }
        System.out.println("Highest number is "+highest);
        System.out.println("Lowest number is "+lowest);
    }
}
