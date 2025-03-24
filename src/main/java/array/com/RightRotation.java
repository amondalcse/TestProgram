package array.com;

import java.util.Arrays;

public class RightRotation
{
    public static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;
            start ++;
            end--;
        }
    }
    public static void rotateRight(int[] arr, int k){
        int n = arr.length;
        k =k%n; //it
        reverse(arr, 0, n-1);
        reverse(arr, 0 , k-1);
        reverse(arr, k, n-1);
    }

    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        int k=4;

        System.out.println("Original Array"+ Arrays.toString(arr));
        rotateRight(arr,k);
        System.out.println("rotate Array"+ Arrays.toString(arr));
    }
}
