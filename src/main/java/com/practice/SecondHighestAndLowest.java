package com.practice;

public class SecondHighestAndLowest
{
    public static void main(String[] args){
        int[] array = {15,17,34,22,44,61,56, 20};
        int largest =array[0];
        int secondHighest=array[0];
        int secondLowest=array[0];
        int lowest=array[0];

        for(int i=0;i<array.length;i++){
            if(array[i]>largest){
                largest = array[i];
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]>secondHighest && array[i]!=largest){
                secondHighest=array[i];
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i] < lowest){
                lowest=array[i];
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i] < secondLowest && array[i]!=lowest){
                secondLowest=array[i];
            }
        }
        System.out.println("second highest is : "+ secondHighest);
        System.out.println("second Lowest is : "+ secondLowest);
        System.out.println("lowest number is : "+ lowest);



    }

}
