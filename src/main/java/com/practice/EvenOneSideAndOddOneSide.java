package com.practice;

public class EvenOneSideAndOddOneSide
{
    public static void main(String[] args) {
        int[] numbers ={1,4,3,5,8,9};
        int evenIndex=0;
        int oddIndex=numbers.length/2;
        int[] result =new int[numbers.length];

        for(int i=0;i<numbers.length-1;i++){
        //for(int num: numbers){
            if(numbers[i] % 2 ==0){
            //if(num % 2 ==0){
                result[evenIndex]=numbers[i];
                //result[evenIndex]=num;
                evenIndex++;
            }else{
                result[oddIndex]=numbers[i];
                //result[oddIndex]=num;
                oddIndex++;
            }
        }
        /*for(int i=0;i<result.length;i++){
            System.out.print(result[i] +" ");
        }*/
        for(int num:result){
            System.out.print(num +" ");
        }
    }
}
