package com.practice;

import java.util.Arrays;

public class Pr {
    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int evenIndex = 0;
        int oddIndex = numbers.length / 2;
        int result[] = new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] % 2 ==0){
                result[evenIndex]=numbers[i];
                evenIndex++;
            }else{
                result[oddIndex]=numbers[i];
                oddIndex++;
            }
        }
        for (int num: result){
            System.out.print(num);
        }


        //another question

        //int[] numbers = {1, 2, 0, 3, 4, 0, 5, 0};
        //int rightSide=0;
        //int number = numbers.length/2;
        //int[] result = new int[numbers.length-1];
        /*int index = numbers.length - 1;

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] != 0) {
                numbers[index--] = numbers[i];
            }
        }
        while (index >= 0) {
            numbers[index--] = 0;
        }


        System.out.print(Arrays.toString(numbers));*/
        /*int count=0;
        for(int i=0;i<numbers.length;i++){
            int j;
            for(j=i+1;j<numbers.length;j++){
                if(numbers[i]==numbers[j]){
                    count++;
                    System.out.print(numbers[j]);
                }

            }


        }*/

    }
}
