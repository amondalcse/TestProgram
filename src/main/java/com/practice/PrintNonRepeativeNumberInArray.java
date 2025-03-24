package com.practice;

public class PrintNonRepeativeNumberInArray
{
    public static void main(String[] args) {
        int[] array={1,2,2,3,4,5,4,6};
        for(int i=0;i<array.length;i++){
            int count=0;
            for(int j=0;j<array.length;j++){
                if(array[i]==array[j]){
                    count++;
                    //System.out.print(array[j]+" ");
                }
            }
            if(count==1){
                System.out.print(array[i]+" ");
            }
        }
    }
}
